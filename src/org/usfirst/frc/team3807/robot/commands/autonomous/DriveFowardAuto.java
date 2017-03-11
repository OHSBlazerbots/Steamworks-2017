package org.usfirst.frc.team3807.robot.commands.autonomous;

import org.usfirst.frc.team3807.robot.commands.Drive;
import org.usfirst.frc.team3807.robot.commands.HaltRobot;
import org.usfirst.frc.team3807.robot.commands.Proto.DriveProto;
import org.usfirst.frc.team3807.robot.commands.Proto.HaltProtoType;
import org.usfirst.frc.team3807.robot.subsystems.PrototypeMotors;

import edu.wpi.first.wpilibj.command.WaitCommand;

public class DriveFowardAuto extends Autonomous{
	public DriveFowardAuto(){
		//addSequential(new Drive(1, 0));
		addSequential(new Drive(.6, 0));
		addSequential(new WaitCommand(2.5));
		addSequential(new HaltRobot());
	}
}
