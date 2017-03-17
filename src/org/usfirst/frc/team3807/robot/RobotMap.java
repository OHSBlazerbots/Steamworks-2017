package org.usfirst.frc.team3807.robot;

import com.ctre.CANTalon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	/*
	PORTS TAKEN: 1, 2, 4, 5, 6,7, 8
	FREE PORTS: 3
	*/
	//ID's for the Chassis the Wheels, Cantalon
	public static int RIGHT = 6;
	public static int LEFT = 1;
	
	//IDs for the joysticks
	public static int XBOX_CONTROLLER = 0; 
	public static int CODRIVER_JOYSTICK_PORT = -1;
	public static int CODRIVER_JOYSTICK_PORT2= -1; 
	public static int JOYSTICK_PORT = 1;
	
//	//chassis talons
//	public static CANTalon LEFT_TALON = new CANTalon(LEFT);
//	public static CANTalon RIGHT_TALON = new CANTalon(RIGHT);
//	
	//Picker Upper/Intake
	public static int INTAKE_LEFT = 2;
	public static int INTAKE_RIGHT = 4;

	
	//Climber
	public static int CLIMBER_MOTOR = -1;
	public static CANTalon CLIMBER = new CANTalon(CLIMBER_MOTOR);
	
	//Shooter
	public static int SHOOTER_LEFT = 7;
	public static int SHOOTER_RIGHT = 8;
	public static int ANGLE_CHANGER = 5;
	
	
	//prototype motors for 2017 steamworks
	public static int PROTO_TYPE = -1;
	public static int PROTO_TYPE_2 = -1;
	public static CANTalon PROTO_TYPE_MOTOR = new CANTalon(PROTO_TYPE);
	public static CANTalon PROTO_TYPE_MOTOR_2 = new CANTalon(PROTO_TYPE_2);
}
