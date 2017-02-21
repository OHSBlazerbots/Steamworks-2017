package org.usfirst.frc.team3807.robot.commands.Intake;

import org.usfirst.frc.team3807.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunIntake extends CommandBase {
	double speed;

    public RunIntake(double spd1) {
        // Use requires() here to declare subsystem dependencies
        speed=spd1;
    	requires(intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	intake.runIntake(speed);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//intake.runIntake(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	//intake.runIntake(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
 