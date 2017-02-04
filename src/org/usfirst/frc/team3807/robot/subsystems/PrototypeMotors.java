package org.usfirst.frc.team3807.robot.subsystems;

import org.usfirst.frc.team3807.robot.commands.DriveProtoWithJoystick;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PrototypeMotors extends Subsystem {
	
	CANTalon protoMotor;
	
	public PrototypeMotors(int P){
		if(P != -1){
			protoMotor = new CANTalon(P);
		}
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new DriveProtoWithJoystick());
	}
	
	public void runProtoTypeMotors(XboxController controller){
		double speedProto = 0;
		
		speedProto = controller.getX(Hand.kLeft)*0.6;
		protoMotor.set(speedProto);
		
	}

}
