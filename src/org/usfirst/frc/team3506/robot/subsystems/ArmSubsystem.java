package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;
import org.usfirst.frc.team3506.robot.commands.arm.UserDriveArmCommand;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmSubsystem extends Subsystem {
	
	private CANTalon mainLeft, followerRight;
    
	public ArmSubsystem() {
		mainLeft = new CANTalon(RobotMap.LEFT_ARM_CANTALON_ID);
		followerRight = new CANTalon(RobotMap.RIGHT_ARM_CANTALON_ID);
		
		followerRight.changeControlMode(CANTalon.TalonControlMode.Follower);
		followerRight.set(RobotMap.LEFT_ARM_CANTALON_ID);
		
		//We don't know about which needs to be inverted (one does), but for now we'll assume the right
		followerRight.setInverted(true);
	}
	
	//Positive is down (like joystick up == aircraft down)
	public void moveArmAtSpeed(double speed) {
		mainLeft.set(speed);
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new UserDriveArmCommand());
    }
}

