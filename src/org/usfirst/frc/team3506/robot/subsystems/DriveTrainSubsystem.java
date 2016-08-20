package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;
import org.usfirst.frc.team3506.robot.commands.drivetrain.UserDriveCommand;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {

	private CANTalon left1, left2, right1, right2;
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
		left1 = new CANTalon(RobotMap.LEFT1_CANTALON_ID);
		left2 = new CANTalon(RobotMap.LEFT2_CANTALON_ID);
		right1 = new CANTalon(RobotMap.RIGHT1_CANTALON_ID);
		right2 = new CANTalon(RobotMap.RIGHT2_CANTALON_ID);

		left2.changeControlMode(CANTalon.TalonControlMode.Follower);
		left2.set(RobotMap.LEFT1_CANTALON_ID);
		right2.changeControlMode(CANTalon.TalonControlMode.Follower);
		right2.set(RobotMap.RIGHT2_CANTALON_ID);

		robotDrive = new RobotDrive(left1, right1);

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
		left1.set(speed);
	}

	public void moveRightTrain(double speed) {
		right1.set(speed);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new UserDriveCommand());
	}
}
