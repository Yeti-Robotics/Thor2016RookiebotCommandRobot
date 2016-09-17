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

	private Talon leftFront, leftBack, rightFront, rightBack;
	private RobotDrive robotDrive;
	private ControlType controlType;
	private Front front;

	public static enum ControlType {
		TANK, ARCADE
	}

	public static enum Front {
		SHOOTER, CLIMBER
	}

	public DriveTrainSubsystem() {
		leftFront = new Talon(RobotMap.LEFT_FRONT_TALON_PORT);
		leftBack = new Talon(RobotMap.LEFT_BACK_TALON_PORT);
		rightFront = new Talon(RobotMap.RIGHT_FRONT_TALON_PORT);
		rightBack = new Talon(RobotMap.RIGHT_BACK_TALON_PORT);

		robotDrive = new RobotDrive(leftFront, leftBack, rightFront, rightBack);

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
		robotDrive.tankDrive(left, right);
	}

	public void arcadeDrive(double forward, double side) {
		robotDrive.arcadeDrive(forward, side);
	}

	public void driveStraight(double speed) {
		moveLeftTrain(speed);
		moveRightTrain(speed);
	}

	public void moveLeftTrain(double speed) {
		leftFront.set(speed);
		leftBack.set(speed);
	}

	public void moveRightTrain(double speed) {
		rightFront.set(speed);
		rightBack.set(speed);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new UserDriveCommand());
	}
}
