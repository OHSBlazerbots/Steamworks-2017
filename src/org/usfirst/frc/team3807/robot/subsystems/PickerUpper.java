package org.usfirst.frc.team3807.robot.subsystems;

import org.usfirst.frc.team3807.robot.commands.DriveProtoWithJoystick;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.XboxController;

public class PickerUpper extends SensorBase {
	
	CANTalon intake1;
	CANTalon intake2;
	
	public PickerUpper(int one, int two){
		if(one!=-1 && two!=-1)
		{
			intake1= new CANTalon(one);
			intake2 = new CANTalon(two);
		}
	}
//	@Override
//	protected void initDefaultCommand() {
//		// TODO Auto-generated method stub
//		setDefaultCommand(new DriveProtoWithJoystick());
//	}
	
	public void runIntake(){
		double speedIntake = 0;
		intake1.set(speedIntake);
		intake2.set(-speedIntake);
		
		
	}
	public void reverseIntake(){
		double speedIntake = 0;
		intake1.set(-speedIntake);
		intake2.set(speedIntake);
	}
}
