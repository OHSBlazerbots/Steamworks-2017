package org.usfirst.frc.team3807.robot.subsystems;

import org.usfirst.frc.team3807.robot.OI;
import org.usfirst.frc.team3807.robot.RobotMap;
import org.usfirst.frc.team3807.robot.commands.DriveWithJoystick;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * CANTalon replaced with CANTalon
 */
public class Chassis extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	// RobotDrive robotDrive;
	CANTalon left, right;
	public RobotDrive drive;
	
	CANTalon protoMotor;
	//private CANTalon protoMotor2 = new CANTalon(RobotMap.PROTO_TYPE2);
	private boolean reverse;

	public Chassis(int L, int R, int P) {
		if (L != -1 && R != -1) {
			// robotDrive = new RobotDrive(frontL, backL, frontR, backR);
			left = new CANTalon(L);
			right = new CANTalon(R);
		}
		if(P != -1){
			protoMotor = new CANTalon(P);
		}
		drive = new RobotDrive(left, right);
		drive.setSafetyEnabled(false);
	}
	
	//drives the prototype motor - refer to DriveProtoWithJoystick Command
		public void driveProtoWithJoystick(XboxController controller)
		{ 
			double speedProto = 0;
			
			speedProto = controller.getX(Hand.kLeft);
			protoMotor.set(speedProto);
			
			//if(controller.getXButton()){
			//	speedProto = 0.8;
			//}else if(controller.getAButton()){
			//speedProto = 0.2;
			//}else{
			//	speedProto = 0;
			//}
		 
			//this.protoMotor.set(speedProto);
			//this.protoMotor2.set(speedProto);
			
			//this.protoMotor.set(.5);
			//this.protoMotor2.set(.5);
		}

	public void drive(double speed, double turn) {
		drive.arcadeDrive(speed, turn);
	}

	// getting user input with joysticks
	
	 public void driveWithJoystick(Joystick joystick) {
		//Changes how fast the robot is going. The turn changes how fast it turns, that values must be high in order for the robot to turn
		//move changes how fast the robot moves forward and backwards and so that value has to be lower to fit the speed of turn.
		double turn = joystick.getZ()*.7;
			 //Drive is the y
			 double move = joystick.getY()*.7;
			//the code above slows down the robot, remove *0.x to bring it back to normal speed
			drive(move, turn);
	 }

	
	public void driveWithJoystickInverse(Joystick joystick) {
		//Changes how fast the robot is going. The turn changes how fast it turns, that values must be high in order for the robot to turn
		//move changes how fast the robot moves foward and backwards and so that value has to be lower to fit the speed of turn.
		double turn = joystick.getZ()*-0.7;
			// Drive is the y
			double move = joystick.getY()*0.7;
			//the code above slows down the robot, remove *0.x to bring it back to normal speed
		drive(move, turn);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new DriveWithJoystick()); 
	
	}

	public void Halt() {
		left.set(0);
		right.set(0);
	}
}