package org.usfirst.frc.team3807.robot.subsystems;



import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shooter extends Subsystem{

	CANTalon talonA, talonB, talonAngle;
	
	
	public Shooter(int talonPortA, int talonPortB, int talonAng){
		if(talonPortA != -1 && talonPortB != -1 && talonAng != -1){
			talonA = new CANTalon(talonPortA);
			talonB = new CANTalon(talonPortB);
			talonAngle = new CANTalon(talonAng);
		    
		}
	}
	
	public void setShooterSpeed(double speed){
		talonA.set(-speed);
		talonB.set(speed);
	}
	
//	//Range is typically 0 to 170 degrees, but check specs.
//	public void setPotAngle(double angle){
//		
//	}
	
	public double getPotValue(){
		return talonAngle.getAnalogInPosition();
	}
	
	
	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		//setDefaultCommand(new PutPotValues());
	}

}
