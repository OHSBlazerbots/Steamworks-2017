package org.usfirst.frc.team3807.robot.commands.Shooter;

import org.usfirst.frc.team3807.robot.commands.CommandBase;


/**
 *
 */
public class RunShooter extends CommandBase {

    public RunShooter() {
        // Use requires() here to declare subsystem dependencies
        requires(pShooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	pShooter.setShooterSpeed(0.8);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//Can be set in *future* RobotValues class
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	pShooter.setShooterSpeed(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
