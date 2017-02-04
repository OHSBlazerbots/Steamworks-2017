package org.usfirst.frc.team3807.robot.subsystems;

import org.usfirst.frc.team3807.robot.commands.DriveProtoWithJoystick;

import edu.wpi.first.wpilibj.command.Subsystem;

public class PrototypeMotors extends Subsystem {

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new DriveProtoWithJoystick());
	}
	
	public void runProtoTypeMotors(double speed){
		
	}

}
