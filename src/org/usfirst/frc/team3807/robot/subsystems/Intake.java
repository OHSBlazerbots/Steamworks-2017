package org.usfirst.frc.team3807.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	
	CANTalon intake1;
	CANTalon intake2;
	
	public Intake(int one, int two){
		if(one != -1 && two !=-1){
			intake1= new CANTalon(one);
			intake2 = new CANTalon(two);
		}
	}
	
	public void runIntake(double speedIntake){
		//double speedIntake = 0;
		intake1.set(speedIntake);
		intake2.set(-speedIntake);
	}
	public void reverseIntake(double speedIntake){
		//double speedIntake = 0;
		intake1.set(-speedIntake);
		intake2.set(speedIntake);
	}


	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
