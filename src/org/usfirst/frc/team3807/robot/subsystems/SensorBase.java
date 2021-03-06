package org.usfirst.frc.team3807.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Holds all sensors, performs appropriate calculations, and returns values to SmartDashboard.
 */
public class SensorBase extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

//	private BuiltInAccelerometer bia;
//	private PowerDistributionPanel pdp;
//	Potentiometer pot;
//	private AnalogPotentiometer potV;
	DigitalInput limitSwitch;
	
	public SensorBase()
	{
//		bia = new BuiltInAccelerometer();
//		pdp = new PowerDistributionPanel();
//		//potV = new AnalogPotentiometer(3);
//	    pot = new AnalogPotentiometer(0,360,30);
		limitSwitch = new DigitalInput(0);
	    
	}
	
	public void potValues(){
//		if(pot != null){
			
			//AnalogInput ai = new AnalogInput(3);
			//pot = new AnalogPotentiometer(ai, 360, 30);
			//SmartDashboard.putDouble("Potentiometer Value", pot.get());
			
//			double p = potV.get();
//			p *= 1000;
//			
//			double pot = potV.pidGet();
//			SmartDashboard.putDouble("Potentiometer Value", pot);
		}
	//}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new PutSensorValues());
    }
   
    //returns the acceleration of the RoboRIO along the x axis in g-forces
//    public double getAccelerometerX()
//    {
//    	return bia.getX();
//    }
      
  //returns the acceleration of the RoboRIO along the Y axis in g-forces
//    public double getAccelerometerY()
//    {
//    	return bia.getY();
//    }
    
  //returns the acceleration of the RoboRIO along the z axis in g-forces
//    public double getAccelerometerZ()
//    {
//    	return bia.getZ();
//    }
    
/*//    //returns pdp current
//    public double getTotalPDPCurrent()
//    {
//    	return pdp.getTotalCurrent();
//    }
//
//    //returns specific channels
//    public double getMotorCurrentRightFront()
//    {
//    	return pdp.getCurrent(13);
//    }
//    
//     public double getMotorCurrentLeftFront()
//     {
//    	 return pdp.getCurrent(0);
//     }
//     
//    public double getMotorCurrentRightBack()
//    {
//    	return pdp.getCurrent(12);
//    }
//    
//    public double getMotorCurrentLeftBack()
//    {
//    	return pdp.getCurrent(2);
//    }
 *   
*/    
    public boolean getLimitSwitch()
    {
    	return limitSwitch.get();
    }
    
    public DigitalInput getLS()
    {
    	return limitSwitch;
    }
    //prints the current values on SmartDashboard
    public void printCurrents()
    {
    	//CameraServer.getInstance().startAutomaticCapture("cam4");
    	//CameraServer.getInstance().startAutomaticCapture("cam0");
    }
    
    
}

