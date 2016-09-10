package org.usfirst.frc.team3506.robot.commands.flywheels;

import org.usfirst.frc.team3506.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunFlywheelsCommand extends Command {

    public RunFlywheelsCommand() {
    	requires(Robot.flywheels);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.flywheels.runFlywheels();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
