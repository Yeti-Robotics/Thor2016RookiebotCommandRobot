package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class HammerSubsystem extends Subsystem {
    
	private DoubleSolenoid hammer;
	
	public HammerSubsystem() {
		hammer = new DoubleSolenoid(RobotMap.HAMMER_FORWARD_SOLENOIDCHANNEL, RobotMap.HAMMER_REVERSE_SOLENOIDCHANNEL);
	}
	
	//If this isnt correct, go to the Robot map and change the solenoid channels. Keep kForward as up
	public void hammerUp() {
		hammer.set(Value.kForward);
	}
	
	public void hammerDown() {
		hammer.set(Value.kReverse);
	}
	
    public void initDefaultCommand() {}
}

