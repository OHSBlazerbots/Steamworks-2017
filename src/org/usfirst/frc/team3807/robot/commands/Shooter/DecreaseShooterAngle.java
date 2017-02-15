package org.usfirst.frc.team3807.robot.commands.Shooter;

import org.usfirst.frc.team3807.robot.commands.CommandBase;

public class DecreaseShooterAngle extends CommandBase{
	
	public DecreaseShooterAngle(){
		requires(shooter);
	}
	protected void initialize() {
		shooter.setServoAngle(shooter.getServoAngle() - 10);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//Can be set in *future* RobotValues class
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
