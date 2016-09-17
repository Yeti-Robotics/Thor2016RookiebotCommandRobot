package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeSubsystem extends Subsystem {
	
	private Relay beltTalon, rollerBarTalon;
    
	public IntakeSubsystem() {
		beltTalon = new Relay(RobotMap.INTAKE_BELT_SPIKE_PORT);
		rollerBarTalon = new Relay(RobotMap.INTAKE_ROLLER_BAR_SPIKE_PORT);
	}
	
	public void runIntake() {
		beltTalon.set(RobotMap.RUN_INTAKE_BELT_VALUE);
		rollerBarTalon.set(RobotMap.RUN_INTAKE_ROLLER_BAR_VALUE);
	}
	
	public void stopIntake() {
		beltTalon.set(Value.kOff);
		rollerBarTalon.set(Value.kOff);
	}

    public void initDefaultCommand() {
    }
}

