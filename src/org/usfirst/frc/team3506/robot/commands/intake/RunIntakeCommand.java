package org.usfirst.frc.team3506.robot.commands.intake;

import org.usfirst.frc.team3506.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunIntakeCommand extends Command {

    public RunIntakeCommand() {
        requires(Robot.intake);
    }

    protected void initialize() {
    	Robot.intake.runIntake();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.intake.stopIntake();
    }

    protected void interrupted() {
    	end();
    }
}
