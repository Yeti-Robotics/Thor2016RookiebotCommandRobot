package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;
import org.usfirst.frc.team3506.robot.commands.drivetrain.UserDriveCommand;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {

	private Talon left1, left2, left3, right1, right2, right3;
	private ControlType controlType;
	private Front front;

	public static enum ControlType {
		TANK, ARCADE
	}

	public static enum Front {
		SHOOTER, CLIMBER
	}

	public DriveTrainSubsystem() {
		left1 = new Talon(RobotMap.LEFT_1_TALON_PORT);
		left2 = new Talon(RobotMap.LEFT_2_TALON_PORT);
		left3 = new Talon(RobotMap.LEFT_3_TALON_PORT);
		right1 = new Talon(RobotMap.RIGHT_1_TALON_PORT);
		right2 = new Talon(RobotMap.RIGHT_2_TALON_PORT);
		right3 = new Talon(RobotMap.RIGHT_3_TALON_PORT);

		right1.setInverted(true);
		right2.setInverted(true);
		right3.setInverted(true);
		
		front = Front.SHOOTER;
		controlType = ControlType.TANK;
	}

	public void setFront(Front front) {
		this.front = front;
	}

	public Front getFront() {
		return front;
	}

	public void setControlType(ControlType controlType) {
		this.controlType = controlType;
	}

	public ControlType getControlType() {
		return controlType;
	}

	public void tankDrive(double left, double right) {
		moveLeftTrain(left);
		moveRightTrain(right);
	}

	public void arcadeDrive(double moveValue, double rotateValue) {
		double leftMotorSpeed, rightMotorSpeed;

		if (moveValue > 0.0) {
			if (rotateValue > 0.0) {
				leftMotorSpeed = moveValue - rotateValue;
				rightMotorSpeed = Math.max(moveValue, rotateValue);
			} else {
				leftMotorSpeed = Math.max(moveValue, -rotateValue);
				rightMotorSpeed = moveValue + rotateValue;
			}
		} else {
			if (rotateValue > 0.0) {
				leftMotorSpeed = -Math.max(-moveValue, rotateValue);
				rightMotorSpeed = moveValue + rotateValue;
			} else {
				leftMotorSpeed = moveValue - rotateValue;
				rightMotorSpeed = -Math.max(-moveValue, -rotateValue);
			}
		}
		
		moveLeftTrain(leftMotorSpeed);
		moveRightTrain(rightMotorSpeed);
	}

	public void driveStraight(double speed) {
		moveLeftTrain(speed);
		moveRightTrain(speed);
	}

	public void moveLeftTrain(double speed) {
		left1.set(speed);
		left2.set(speed);
		left3.set(speed);
	}

	public void moveRightTrain(double speed) {
		right1.set(speed);
		right2.set(speed);
		right3.set(speed);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new UserDriveCommand());
	}
}
