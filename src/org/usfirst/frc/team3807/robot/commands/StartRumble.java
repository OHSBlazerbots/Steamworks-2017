package org.usfirst.frc.team3807.robot.commands;

import org.usfirst.frc.team3807.robot.RobotMap;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StartRumble extends CommandBase {
	
	
	
    public StartRumble() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(rumble);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	rumble.setRumble();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
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
