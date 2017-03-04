package org.usfirst.frc.team3807.robot.commands.Shooter;

import org.usfirst.frc.team3807.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class IncreaseShooterAngle extends CommandBase{
	
	double val;
	public IncreaseShooterAngle(double v){
		requires(pShooter);
		val = v;
	}
	protected void initialize() {
		pShooter.setSetpoint(pShooter.getSetpoint() + val);
		SmartDashboard.putDouble("Get SetPoint", pShooter.getSetpoint());
		//SmartDashboard.putBoolean("output", pShooter.onTarget());
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
		return true;
	}

}
