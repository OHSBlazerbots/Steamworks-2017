package org.usfirst.frc.team3807.robot.subsystems;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class PIDShooter extends PIDSubsystem{
	
	CANTalon shooterRight, shooterLeft, shooterAngle;
	Potentiometer potent;
	
	
	public PIDShooter(double p, double i, double d, int shooterR, int shooterL, int shooterA)
	{
		super("shooter", p, i, d);
		shooterRight = new CANTalon(shooterR);
		shooterLeft = new CANTalon(shooterL);
		shooterAngle = new CANTalon(shooterA);
		potent = new AnalogPotentiometer(3);
		this.setOutputRange(-1, 1);
	}

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		potent.setPIDSourceType(PIDSourceType.kDisplacement);
		shooterAngle.setFeedbackDevice(FeedbackDevice.AnalogPot);
		SmartDashboard.putNumber("Talon- Get SetPoint", shooterAngle.getSetpoint());
//		SmartDashboard.putDouble("Pot - get", potent.get());
		SmartDashboard.putNumber("Talon - PIDGet",shooterAngle.pidGet()); 
		SmartDashboard.putNumber("Angle", this.convertPotToAngle(shooterAngle.pidGet()));
		

		return shooterAngle.pidGet();

	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		SmartDashboard.putNumber("output", output);
		
		shooterAngle.pidWrite(output);
		
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}


	//sets the speed of the fly wheels
	public void setShooterSpeed(double speed){
		//both motors should be turning outward meaning they will be spinning in opposite directions
		shooterRight.set(speed);
		shooterLeft.set(-speed);
	}
	
	
	//increases the shooter angle by a given parameter (0 to 1023)
	public void increaseShooterAngle(double value){
		shooterAngle.set(shooterAngle.get() + value);
	}
	
	private double convertPotToAngle(double potVal){
		double highOutput = 1023;
		double rotationAngle= 300;
		
		return (rotationAngle/highOutput)*potVal;
	}
}
