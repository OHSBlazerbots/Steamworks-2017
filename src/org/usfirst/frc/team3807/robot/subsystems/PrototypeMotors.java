package org.usfirst.frc.team3807.robot.subsystems;

import org.usfirst.frc.team3807.robot.commands.DriveProtoWithJoystick;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;
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
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new DriveProtoWithJoystick());
	}
	
	public void runProtoTypeMotors(XboxController controller){
		double speedProto = 0;
		
		speedProto = controller.getY(Hand.kLeft)*.85;
		protoMotor.set(speedProto);
		protoMotor2.set(speedProto);
		
	}

}
