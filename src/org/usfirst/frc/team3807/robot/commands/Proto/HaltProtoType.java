package org.usfirst.frc.team3807.robot.commands.Proto;

import org.usfirst.frc.team3807.robot.commands.CommandBase;

public class HaltProtoType extends CommandBase{
	public HaltProtoType()
	{
		requires(protos);
	}
	protected void initialize() {
        protos.setSpeed(0);
    }
	// Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}
	// Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
