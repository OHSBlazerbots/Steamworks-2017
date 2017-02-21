package org.usfirst.frc.team3807.robot.subsystems;

import org.usfirst.frc.team3807.robot.commands.Proto.DriveProtoWithJoystick;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PrototypeMotors extends Subsystem {
	
	CANTalon protoMotor;
	CANTalon protoMotor2;
	
	public PrototypeMotors(int P , int Q){
		//if(P != -1 && Q !=-1){
			protoMotor = new CANTalon(P);
			protoMotor2 = new CANTalon(Q);
		//}
	}
	
	public void setSpeed(double speed1) {
		 protoMotor.set(-speed1);
		 protoMotor2.set(speed1);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new DriveProtoWithJoystick());
	}
	
	public void runProtoTypeMotors(XboxController controller){
		double speedProto = 0;
		
		speedProto = controller.getY(Hand.kRight)* 1.0;
		this.setSpeed(speedProto);
		
	}

}
