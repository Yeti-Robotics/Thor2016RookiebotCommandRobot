package org.usfirst.frc.team3506.robot.commandgroups;

import org.usfirst.frc.team3506.robot.RobotMap;
import org.usfirst.frc.team3506.robot.commands.flywheels.RunFlywheelsCommand;
import org.usfirst.frc.team3506.robot.commands.hammer.FireHammerCommandGroup;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class FireBallCommandGroup extends CommandGroup {
    
    public  FireBallCommandGroup() {
    	addSequential(new RunFlywheelsCommand());
    	addSequential(new WaitCommand(RobotMap.FLYWHEELS_TIMETOFULLSPEED));
    	addSequential(new FireHammerCommandGroup());
    }
}
