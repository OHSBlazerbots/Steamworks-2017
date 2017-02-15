package org.usfirst.frc.team3807.robot.commands.Proto;

import org.usfirst.frc.team3807.robot.commands.CommandBase;
import org.usfirst.frc.team3807.robot.subsystems.PrototypeMotors;

public class DriveProto extends CommandBase{
	
	double speed1;
	public DriveProto(double spd1){
		speed1=spd1;
		requires(protos);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		protos.setSpeed(speed1);
	}
	
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}
	public static void drive(double speed12) {
		// TODO Auto-generated method stub
		
	}

}
