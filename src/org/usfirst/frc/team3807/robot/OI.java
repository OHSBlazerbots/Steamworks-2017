package org.usfirst.frc.team3807.robot;
import org.usfirst.frc.team3807.robot.commands.StartRumble;
import org.usfirst.frc.team3807.robot.commands.Intake.HaltIntake;
import org.usfirst.frc.team3807.robot.commands.Intake.ReverseIntake;
import org.usfirst.frc.team3807.robot.commands.Intake.RunIntake;
import org.usfirst.frc.team3807.robot.commands.Shooter.DecreaseShooterAngle;
import org.usfirst.frc.team3807.robot.commands.Shooter.IncreaseShooterAngle;
import org.usfirst.frc.team3807.robot.commands.Shooter.RunShooter;
import org.usfirst.frc.team3807.robot.commands.Shooter.StopShooter;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	
	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	private static Joystick joystick = new Joystick(RobotMap.JOYSTICK_PORT);
	private static Joystick coDriver1 = new Joystick(RobotMap.CODRIVER_JOYSTICK_PORT);
	private static Joystick coDriver2 = new Joystick(RobotMap.CODRIVER_JOYSTICK_PORT2);
	public static XboxController xBoxCoDriver = new XboxController(RobotMap.XBOX_CONTROLLER);
	//private final JoystickButton inverse;
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);
	
//	//Creating the Buttons for Intake
	private final JoystickButton intake1;
	private final JoystickButton intake2;
	private final JoystickButton intake3;
	//private final JoystickButton testXBoxButton;
	
	//creating the Buttons for pShooter
	//private final JoystickButton increaseAngle, decreaseAngle, startShooter, stopShooter;
	//private final JoystickButton startShooter, stopShooter;
//	
	private final JoystickButton startShooter, stopShooter;
	//rumbleButton;
	//Creating the Buttons for Climber
	//Creating the Buttons for Shooter
	
	public OI()
	{
		//Add buttons to this area in OI so you can click them on the joystick or on the xbox controller.
		//You have to add a button in this method so that the robot can move when you click a button on the joystick or the xbox controller.
		//inverse = new JoystickButton(joystick,7); //It is button one on the driver joystick, it changes the direction of ther robot controls for chassis
		//inverse.toggleWhenPressed(new InverseDrive());
		
		//setting the buttons for intake
		intake1=new JoystickButton(joystick,3);
		intake1.whenPressed(new ReverseIntake(0.5));
//		//testXBoxButton = new JoystickButton(xBoxCoDriver, 0);
		intake2=new JoystickButton(joystick,1);
		intake2.toggleWhenPressed(new RunIntake(0.9));
//		   
		intake3 = new JoystickButton(joystick,2);
		intake3.whenPressed(new HaltIntake());
		
		//shooter buttons, on the xbox, the xbox buttons have numbers and triggers than one can access them the normal way for buttons
//		increaseAngle = new JoystickButton(this.xBoxCoDriver, 4);
//		increaseAngle.whenReleased(new IncreaseShooterAngle(30));
//		
//		decreaseAngle = new JoystickButton(this.xBoxCoDriver,1);
//		decreaseAngle.whenReleased(new DecreaseShooterAngle(30));
		
		startShooter = new JoystickButton(xBoxCoDriver, 4);
		startShooter.whenPressed(new RunShooter());
		
		stopShooter = new JoystickButton(xBoxCoDriver, 1);
		stopShooter.whenPressed(new StopShooter());
		
//		rumbleButton = new JoystickButton(this.xBoxCoDriver,7);
//		rumbleButton.whenPressed(new StartRumble());
		
		//while(-1!=0)
		//{
//			if(xBoxCoDriver.getXButton())
//			{
//				xBoxCoDriver.setRumble(GenericHID.RumbleType.kLeftRumble, 1);
//			}
//		//}
		
		
		
//		
		
		//setting the button for Climber
		//setting the button for Shooter
	}
	//The static in this method to be called without being instanced in another 
	public static Joystick getJoystick()
	{
		return joystick;
	}
	//returns the codriver joystick
	public static Joystick getCoDriverJoystick1()
	{
		return coDriver1;
	}
	//
	public static Joystick getCoDriverJoystick2()
	{
		return coDriver2;
	}
	public static XboxController getXBoxController()
	{
		return xBoxCoDriver;
	}
	
	
	
}
