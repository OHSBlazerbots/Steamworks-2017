package org.usfirst.frc.team3807.robot.commands.autonomous;

import org.usfirst.frc.team3807.robot.commands.Drive;
import org.usfirst.frc.team3807.robot.commands.DriveCheckLimit;
import org.usfirst.frc.team3807.robot.commands.HaltRobot;

import edu.wpi.first.wpilibj.command.WaitCommand;

public class GearAutoCenter extends Autonomous{
	public GearAutoCenter(){
		addSequential(new DriveCheckLimit(.7, 0));
		addSequential(new WaitCommand(2.0));
		addSequential(new HaltRobot());
	}

}
