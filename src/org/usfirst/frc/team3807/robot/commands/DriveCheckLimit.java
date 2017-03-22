package org.usfirst.frc.team3807.robot.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCheckLimit extends CommandBase {

	double spd, t;
	
	public DriveCheckLimit(double speed, double turn)
	{
		spd = speed;
		t = turn;
		requires(chassis);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		chassis.drive(spd, t);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return chassis.isLimitSwitchPressed();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		chassis.drive(0,0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}
}
