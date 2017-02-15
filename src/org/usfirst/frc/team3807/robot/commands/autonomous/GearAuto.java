package org.usfirst.frc.team3807.robot.commands.autonomous;

import org.usfirst.frc.team3807.robot.commands.Drive;
import org.usfirst.frc.team3807.robot.commands.HaltRobot;

import edu.wpi.first.wpilibj.command.WaitCommand;

public class GearAuto extends Autonomous{
	public GearAuto(){
		addSequential(new Drive(.7, 0));
		addSequential(new WaitCommand(2.0));
		addSequential(new Drive(0, 0.3));
		addSequential(new Drive(.2,0));
		addSequential(new HaltRobot());
	}

}
