package org.usfirst.frc.team3807.robot;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import org.usfirst.frc.team3807.robot.commands.CommandBase;
import org.usfirst.frc.team3807.robot.commands.autonomous.DoNothingAuto;
import org.usfirst.frc.team3807.robot.commands.autonomous.DriveFowardAuto;
import org.usfirst.frc.team3807.robot.commands.autonomous.GearAutoCenter;
import org.usfirst.frc.team3807.robot.commands.autonomous.GearAutoLeft;
import org.usfirst.frc.team3807.robot.commands.autonomous.GearAutoRight;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
//import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;

	Command autonomousCommand;
	SendableChooser autoChooser;
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();
		CommandBase.init();
		autoChooser = new SendableChooser();
		autoChooser.addDefault("DoNothingAuto", new DoNothingAuto());
		autoChooser.addObject("DriveFoward", new DriveFowardAuto());
		autoChooser.addObject("GearAutoRight", new GearAutoRight());
		autoChooser.addObject("GearAutoCenter", new GearAutoCenter());
		autoChooser.addObject("GearAutoLeft", new GearAutoLeft());
		
		SmartDashboard.putData("Autonomoous mode chooser", autoChooser);
		
		
//		UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
//		
//		VisionThread visionThread = new VisionThread(camera, new GripPipeline(), pipeline -> {
//	        if (!pipeline.findBlobsOutput().isContinuous()) {
//	             c = Imgproc.circle(pipeline.findBlobsOutput().get(0, 0), center, radius, color);
//	            synchronized (imgLock) {
//	                centerX = r.x + (r.width / 2);
//	            }
//	        }
//	    });
//	    visionThread.start();
		
		
		
		new Thread(() -> {
			UsbCamera camera = CameraServer.getInstance().startAutomaticCapture("cam0",0);
			UsbCamera camera2 = CameraServer.getInstance().startAutomaticCapture("cam1",1);
            camera.setResolution(640, 480);
            camera2.setResolution(320, 240);
            
            CvSink cvSink = CameraServer.getInstance().getVideo();
            CvSource outputStream = CameraServer.getInstance().putVideo("TEST", 640, 480);
            
            Mat source = new Mat();
            Mat output = new Mat();
            
            while(!Thread.interrupted()) {
                cvSink.grabFrame(source);
                Imgproc.cvtColor(source, output, Imgproc.COLOR_COLORCVT_MAX);
                outputStream.putFrame(output);
            }
        }).start();
		
		
		
		
		//autonomousCommand = new ProtoAuto();

//		try {
//			SmartDashboard.getBoolean("DoNothingAuto");
//		} catch (Exception e) {
//			SmartDashboard.putBoolean("DoNothingAuto", false);
//		}
//		
//		if(SmartDashboard.getBoolean("DriveFoward"))
//		{
//			autonomousCommand = new DoNothingAuto();
//		}
		//*****Temp. commented out, camera stuff
//		cams1.startAutomaticCapture();
//		
//		//CameraServer.getInstance().startAutomaticCapture();
//		chooser.addObject("My Auto", new MyAutoCommand());
//		SmartDashboard.putData("Auto mode", chooser);
	}

	private void addServer(String string, int i) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		autonomousCommand = (Command) autoChooser.getSelected();

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */
		
		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		
		//DO NOT USE THIS CODE UNLESS ABSOLUTELY NECESSARY FOR TESTING PURPOSES
//		CANTalon test = new CANTalon(4);
//		test.set(.5);
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
//	private void RobotInit()
//	    {
//		CameraServer server = CameraServer.getInstance();
//		server.setQuality(50);
//		server.startAutomaticCapture("cam0");
//	    }
//	}
}
