package org.usfirst.frc.team3807.robot.commands.autonomous;

import org.usfirst.frc.team3807.robot.commands.Drive;
import org.usfirst.frc.team3807.robot.commands.HaltRobot;

import edu.wpi.first.wpilibj.command.WaitCommand;

public class DriveFowardAuto extends Autonomous{
	public DriveFowardAuto(){
		addSequential(new Drive(1, 0));
		addSequential(new WaitCommand(3.0));
		addSequential(new HaltRobot());
	}
}
