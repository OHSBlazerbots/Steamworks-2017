package org.usfirst.frc.team3807.robot.commands;

import org.usfirst.frc.team3807.robot.OI;
import org.usfirst.frc.team3807.robot.RobotMap;
import org.usfirst.frc.team3807.robot.subsystems.Chassis;
import org.usfirst.frc.team3807.robot.subsystems.Climber;
//import org.usfirst.frc.team3807.robot.subsystems.PotArm;
//import org.usfirst.frc.team3807.robot.subsystems.SensorBase;
import org.usfirst.frc.team3807.robot.subsystems.Intake;
import org.usfirst.frc.team3807.robot.subsystems.PIDShooter;
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

	//shooter: pshooter (PID) or shooter (non PID)....Pick ONE
     public static PIDShooter pShooter = new PIDShooter(.5,.5,.5,RobotMap.SHOOTER_LEFT, RobotMap.SHOOTER_RIGHT, RobotMap.ANGLE_CHANGER);
    // public static Shooter shooter = new Shooter(RobotMap.SHOOTER_LEFT, RobotMap.SHOOTER_RIGHT, RobotMap.ANGLE_CHANGER);
     public static Chassis chassis = new Chassis(RobotMap.LEFT, RobotMap.RIGHT);

     public static OI oi;
    public static SensorBase  sensorBase = new SensorBase();
    public static PrototypeMotors protos = new PrototypeMotors(RobotMap.PROTO_TYPE, RobotMap.PROTO_TYPE_2);
    public static Climber climber = new Climber(RobotMap.CLIMBER_MOTOR);
    public static Intake intake = new Intake(RobotMap.INTAKE_LEFT,RobotMap.INTAKE_RIGHT);
   
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
    	pShooter.enable();
    	pShooter.setSetpoint(1023);
       
        //
        
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
