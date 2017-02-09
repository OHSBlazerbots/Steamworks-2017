package org.usfirst.frc.team3807.robot.commands;

import org.usfirst.frc.team3807.robot.OI;
import org.usfirst.frc.team3807.robot.RobotMap;
import org.usfirst.frc.team3807.robot.subsystems.Chassis;
//import org.usfirst.frc.team3807.robot.subsystems.PotArm;
//import org.usfirst.frc.team3807.robot.subsystems.SensorBase;

import org.usfirst.frc.team3807.robot.subsystems.Climber;
import org.usfirst.frc.team3807.robot.subsystems.PickerUpper;
import org.usfirst.frc.team3807.robot.subsystems.PrototypeMotors;
import org.usfirst.frc.team3807.robot.subsystems.SensorBase;
import org.usfirst.frc.team3807.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;
//import org.usfirst.frc.team3807.robot.subsystems.PIDArmElbow;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use
 * CommandBase.exampleSubsystem
 *
 * @author Author
 */
public abstract class CommandBase extends Command {

    
    public static Chassis chassis;
    public static SensorBase  sensorBase;
    public static PrototypeMotors protos;
    //public static Climber climber;
    public static PickerUpper intake;
    public static Shooter shooter;
    public static OI oi;
    
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
    	
        chassis = new Chassis(RobotMap.LEFT, RobotMap.RIGHT);
        sensorBase = new SensorBase();
        protos = new PrototypeMotors(RobotMap.PROTO_TYPE);
       
        intake = new PickerUpper(RobotMap.INTAKE_1,RobotMap.INTAKE_2);
        //climber = new Climber(RobotMap.CLIMBER_MOTOR);
        
        //OI always instantiated LAST!!!
        oi = new OI();

    }
    
    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
