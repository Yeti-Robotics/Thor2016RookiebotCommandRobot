package org.usfirst.frc.team3506.robot.commands.intake;

import org.usfirst.frc.team3506.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ExtendIntakePiston extends Command {

    public ExtendIntakePiston() {
    }

    protected void initialize() {
    	Robot.intake.extendIntakePiston();
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
