package org.usfirst.frc.team3807.robot.commands;

import org.usfirst.frc.team3807.robot.OI;
import org.usfirst.frc.team3807.robot.RobotMap;

/**
 * @author blazerbots
 *
 */
public class DriveProtoWithJoystick extends CommandBase {

  
	//requires(...) should always be in the constructor!!!
	//any subsystem you use should be here!
	public DriveProtoWithJoystick()
   {
	   requires(chassis);
   }
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	//What does it do?
	protected void execute() {
		// TODO Auto-generated method stub
		chassis.driveProtoWithJoystick(OI.getXBoxController());
		
	}

	@Override
	//When is it done??
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
