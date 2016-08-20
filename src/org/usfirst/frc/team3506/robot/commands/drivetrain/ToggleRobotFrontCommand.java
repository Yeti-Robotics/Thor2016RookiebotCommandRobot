package org.usfirst.frc.team3506.robot.commands.drivetrain;

import org.usfirst.frc.team3506.robot.Robot;
import org.usfirst.frc.team3506.robot.subsystems.DriveTrainSubsystem.Front;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ToggleRobotFrontCommand extends Command {

	public ToggleRobotFrontCommand() {
		requires(Robot.driveTrain);
	}

	protected void initialize() {
		if (Robot.driveTrain.getFront() == Front.SHOOTER) {
    		Robot.driveTrain.setFront(Front.CLIMBER);
    	} else {
    		Robot.driveTrain.setFront(Front.SHOOTER);
    	}
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
