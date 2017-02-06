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
	
	//ID's for the Chassis the Wheels, Cantalon
	public static int RIGHT = 7;
	public static int LEFT = 6;
	
	//IDs for the joysticks
	public static int XBOX_CONTROLLER = 1; 
	public static int CODRIVER_JOYSTICK_PORT = -1;
	public static int CODRIVER_JOYSTICK_PORT2= -1; 
	public static int JOYSTICK_PORT = 0;
	
	//chassis talons
	public static CANTalon LEFT_TALON = new CANTalon(LEFT);
	public static CANTalon RIGHT_TALON = new CANTalon(RIGHT);
	
	//prototype motors for 2017 steamworks
	public static int PROTO_TYPE = 5;
	public static int PROTO_TYPE_2 = 4;
	
	public static CANTalon PROTO_TYPE_MOTOR = new CANTalon(PROTO_TYPE);
	public static CANTalon PROTO_TYPE_MOTOR_2 = new CANTalon(PROTO_TYPE_2);
}
