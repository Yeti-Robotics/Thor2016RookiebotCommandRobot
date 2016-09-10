package org.usfirst.frc.team3506.robot.commands.hammer;

import org.usfirst.frc.team3506.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ThrowHammerDownCommand extends Command {

    public ThrowHammerDownCommand() {
    	requires(Robot.hammer);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.hammer.hammerDown();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
