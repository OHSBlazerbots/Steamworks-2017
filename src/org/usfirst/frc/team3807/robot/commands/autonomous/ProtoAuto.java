package org.usfirst.frc.team3807.robot.commands.autonomous;

import org.usfirst.frc.team3807.robot.commands.Proto.DriveProto;
import org.usfirst.frc.team3807.robot.commands.Proto.HaltProtoType;

import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class ProtoAuto extends Autonomous {

    public ProtoAuto() {
    		//addSequential(new Drive(1, 0));
    		addSequential(new DriveProto(.3));
    		addSequential(new WaitCommand(1.5));
    		addSequential(new HaltProtoType());
    }
}
