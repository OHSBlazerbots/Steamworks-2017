
package org.usfirst.frc.team3807.robot.commands;

import org.usfirst.frc.team3807.robot.OI;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveWithJoystick extends CommandBase {

	private final JoystickButton inverse = new JoystickButton(OI.getJoystick(),1);
//	private AnalogPotentiometer pot = new AnalogPotentiometer(1);
	
    public DriveWithJoystick() {
        // Use requires() here to declare subsystem dependencies
        requires(chassis);
      //  requires(sensorBase);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	if(inverse.get())
//    	{
    	chassis.driveWithJoystickInverse(OI.getJoystick());
//    	}
//    	else
//    		chassis.driveWithJoystickInverse(OI.getJoystick());
    //	sensorBase.printCurrents()
//    	SmartDashboard.putDouble("pot Value", pot.get());
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
