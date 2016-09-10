package org.usfirst.frc.team3506.robot.commands.hammer;

import org.usfirst.frc.team3506.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class FireHammerCommandGroup extends CommandGroup {
    
    public  FireHammerCommandGroup() {
    	addSequential(new ThrowHammerUpCommand());
    	addSequential(new WaitCommand(RobotMap.HAMMER_TIMETOFIREBALL));
    	addSequential(new ThrowHammerDownCommand());
    }
}
