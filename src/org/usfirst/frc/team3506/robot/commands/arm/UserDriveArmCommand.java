package org.usfirst.frc.team3506.robot.commands.arm;

import org.usfirst.frc.team3506.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class UserDriveArmCommand extends Command {

    public UserDriveArmCommand() {
    	requires(Robot.arm);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.arm.moveArmAtSpeed(Robot.oi.getShooterY());
    }

    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
