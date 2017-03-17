package org.usfirst.frc.team3807.robot.subsystems;

import org.usfirst.frc.team3807.robot.OI;
import org.usfirst.frc.team3807.robot.RobotMap;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Rumble extends Subsystem {
//	XboxController xBoxCoDriver = new XboxController(RobotMap.XBOX_CONTROLLER);
	//XboxController xBoxCoDriver;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Rumble(){
    	
    }
	
	
	
	public void setRumble(){
		OI.getXBoxController().setRumble(GenericHID.RumbleType.kLeftRumble, 1);
	}
	public void stopRumble(){
		OI.getXBoxController().setRumble(GenericHID.RumbleType.kLeftRumble, 0);
	
	}
    public void initDefaultCommand() {
         // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}