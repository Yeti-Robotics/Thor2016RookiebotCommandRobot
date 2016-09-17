package org.usfirst.frc.team3506.robot.commands.intake;

import org.usfirst.frc.team3506.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunIntakeCommand extends Command {

    public RunIntakeCommand() {
        requires(Robot.intake);
        requires(Robot.flywheels);
    }

    protected void initialize() {
    	Robot.intake.runIntake();
    }

    protected void execute() {
    	Robot.flywheels.runFlywheelsForIntake();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.intake.stopIntake();
    	Robot.flywheels.stopFlywheels();
    }

    protected void interrupted() {
    	end();
    }
}
