package org.usfirst.frc.team3807.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem{

	CANTalon talonA, talonB;
	private Servo servo;
	
	public Shooter(int talonPortA, int talonPortB, int servoChannel){
		if(talonPortA != -1 && talonPortB != -1){
			talonA = new CANTalon(talonPortA);
			talonB = new CANTalon(talonPortB);
		    servo = new Servo(servoChannel);
		}
	}
	
	public void setShooterSpeed(double speed){
		talonA.set(speed);
		talonB.set(-speed);
	}
	
	//Range is typically 0 to 170 degrees, but check specs.
	public void setServoAngle(int angle){
		servo.setAngle(angle);
	}
	
	public double getServoAngle(){
		return servo.getAngle();
	}
	
	public double getTalonSpeed(){
		return talonA.getSpeed();
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
