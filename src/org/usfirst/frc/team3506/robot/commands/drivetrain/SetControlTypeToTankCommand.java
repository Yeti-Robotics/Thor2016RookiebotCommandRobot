package org.usfirst.frc.team3506.robot.commands.drivetrain;

import org.usfirst.frc.team3506.robot.Robot;
import org.usfirst.frc.team3506.robot.subsystems.DriveTrainSubsystem.ControlType;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetControlTypeToTankCommand extends Command {

	public SetControlTypeToTankCommand() {
		requires(Robot.driveTrain);
	}

	protected void initialize() {
		Robot.driveTrain.setControlType(ControlType.TANK);
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}
