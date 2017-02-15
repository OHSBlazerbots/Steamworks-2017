package org.usfirst.frc.team3807.robot.subsystems;

import org.usfirst.frc.team3807.robot.commands.Proto.DriveProtoWithJoystick;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PrototypeMotors extends Subsystem {
	
	CANTalon protoMotor;
	CANTalon protoMotor2;
	
	public PrototypeMotors(int P , int Q){
		if(P != -1 && Q !=-1){
			protoMotor = new CANTalon(P);
			protoMotor2 = new CANTalon(Q);
		}
	}
	
	public void setSpeed(double speed1) {
		 protoMotor.set(speed1);
		 protoMotor2.set(speed1);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new DriveProtoWithJoystick());
	}
	
	public void runProtoTypeMotors(Joystick joystick){
		double speedProto = 0;
		
		speedProto = joystick.getY()*.85;
		this.setSpeed(speedProto);
		
	}

}
