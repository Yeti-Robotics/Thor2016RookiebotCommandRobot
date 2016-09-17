package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeSubsystem extends Subsystem {
	
	private Relay beltTalon, rollerBarTalon;
	private DoubleSolenoid intakePiston;
    
	public IntakeSubsystem() {
		beltTalon = new Relay(RobotMap.INTAKE_BELT_SPIKE_PORT);
		rollerBarTalon = new Relay(RobotMap.INTAKE_ROLLER_BAR_SPIKE_PORT);
		intakePiston = new DoubleSolenoid(RobotMap.INTAKE_PISTON_FORWARD, RobotMap.INTAKE_PISTON_REVERSE);
	}
	
	public void runIntake() {
		beltTalon.set(RobotMap.RUN_INTAKE_BELT_VALUE);
		rollerBarTalon.set(RobotMap.RUN_INTAKE_ROLLER_BAR_VALUE);
	}
	
	public void stopIntake() {
		beltTalon.set(Relay.Value.kOff);
		rollerBarTalon.set(Relay.Value.kOff);
	}
	
	public void extendIntakePiston() {
		intakePiston.set(Value.kForward);
	}
	
	public void retractIntakePiston() {
		intakePiston.set(Value.kReverse);
	}

	public Value getIntakePistonState() {
		return intakePiston.get();
	}
	
    public void initDefaultCommand() {
    }
}

