package org.usfirst.frc.team3807.robot.commands.Shooter;

import org.usfirst.frc.team3807.robot.commands.CommandBase;

/**
 *
 */
public class StopShooter extends CommandBase {

    public StopShooter() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(pShooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	pShooter.setShooterSpeed(0.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
