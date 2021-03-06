package org.usfirst.frc.team3506.robot.commands.flywheels;

import org.usfirst.frc.team3506.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StartFlywheelsCommand extends Command {

    public StartFlywheelsCommand() {
    	requires(Robot.flywheels);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.flywheels.runFlywheels();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
