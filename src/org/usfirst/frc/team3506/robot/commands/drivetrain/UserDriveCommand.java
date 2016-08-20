package org.usfirst.frc.team3506.robot.commands.drivetrain;

import org.usfirst.frc.team3506.robot.Robot;
import org.usfirst.frc.team3506.robot.subsystems.DriveTrainSubsystem.ControlType;
import org.usfirst.frc.team3506.robot.subsystems.DriveTrainSubsystem.Front;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class UserDriveCommand extends Command {

	public UserDriveCommand() {
		requires(Robot.driveTrain);
	}

	protected void initialize() {
	}

	protected void execute() {
		if (Robot.driveTrain.getFront() == Front.SHOOTER) {
			if (Robot.driveTrain.getControlType() == ControlType.TANK) {
				Robot.driveTrain.tankDrive(Robot.oi.getLeftY(), Robot.oi.getRightY());
			} else {
				Robot.driveTrain.arcadeDrive(Robot.oi.getLeftY(), Robot.oi.getRightX());
			}
		} else {
			if (Robot.driveTrain.getControlType() == ControlType.TANK) {
				Robot.driveTrain.tankDrive(-Robot.oi.getRightY(), -Robot.oi.getLeftY());
			} else {
				Robot.driveTrain.arcadeDrive(-Robot.oi.getLeftY(), Robot.oi.getRightX());
			}
		}
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}
