package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class FlywheelsSubsystem extends Subsystem {
    
	private CANTalon flywheels;
	
	public FlywheelsSubsystem() {
		flywheels = new CANTalon(RobotMap.FLYWHEELS_CANTALON_ID);
		
		flywheels.setInverted(true);
	}
	
	//If this goes the wrong direction, change the setInverted! Don't use negative!
	public void runFlywheels() {
		flywheels.set(RobotMap.FLYWHEELS_TALON_SPEED);
	}
	
    public void initDefaultCommand() {}
}

