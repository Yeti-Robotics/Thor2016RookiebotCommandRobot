package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;
import org.usfirst.frc.team3506.robot.commands.arm.UserDriveArmCommand;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmSubsystem extends Subsystem {
	
	private Talon left, right;
    
	public ArmSubsystem() {
		left = new Talon(RobotMap.LEFT_ARM_TALON_PORT);
		right = new Talon(RobotMap.RIGHT_ARM_TALON_PORT);
		
		
		//We don't know about which needs to be inverted (one does), but for now we'll assume the right
		right.setInverted(true);
	}
	
	//Positive is down (like joystick up == aircraft down)
	public void moveArmAtSpeed(double speed) {
		left.set(speed * RobotMap.ARM_MOD);
		right.set(speed * RobotMap.ARM_MOD);
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new UserDriveArmCommand());
    }
}

