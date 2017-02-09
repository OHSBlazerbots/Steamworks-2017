package org.usfirst.frc.team3807.robot.subsystems;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {
	CANTalon climberMotor;
	
	
	public Climber(int climb){
		if(climb!=-1){
		climberMotor = new CANTalon(climb);
		}
	}
//	@Override
//	protected void initDefaultCommand() {
//		// TODO Auto-generated method stub
//		setDefaultCommand(new DriveProtoWithJoystick());
//	}
	public void runClimberMotor(){
		double speedClimber = 0;
		climberMotor.set(speedClimber);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
