package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class FlywheelsSubsystem extends Subsystem {
    
	private Talon flywheels;
	
	public FlywheelsSubsystem() {
		flywheels = new Talon(RobotMap.FLYWHEELS_TALON_PORT);
		
		flywheels.setInverted(true);
	}
	
	//If this goes the wrong direction, change the setInverted! Don't use negative!
	public void runFlywheels() {
		flywheels.set(RobotMap.FLYWHEELS_TALON_SPEED);
	}
	
	public void stopFlywheels() {
		flywheels.set(0);
	}
	
    public void initDefaultCommand() {}
}

