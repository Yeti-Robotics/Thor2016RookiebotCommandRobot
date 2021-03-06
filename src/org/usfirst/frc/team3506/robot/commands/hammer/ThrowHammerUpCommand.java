package org.usfirst.frc.team3506.robot.commands.hammer;

import org.usfirst.frc.team3506.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ThrowHammerUpCommand extends Command {

    public ThrowHammerUpCommand() {
    	requires(Robot.hammer);
    }

    protected void initialize() {
    }

    protected void execute() {
    	if (Robot.intake.getIntakePistonState() == Value.kReverse) {
    		Robot.hammer.hammerUp();
    	}
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
