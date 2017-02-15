package org.usfirst.frc.team3807.robot.commands.Shooter;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class TimeShooter extends CommandGroup {

	public TimeShooter(){
		//addSequential(new Drive(1, 0));
		addSequential(new RunShooter());
		addSequential(new WaitCommand(3.0));
		addSequential(new StopShooter());
	}
}
