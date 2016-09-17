package org.usfirst.frc.team3506.robot;

import org.usfirst.frc.team3506.robot.subsystems.ArmSubsystem;
import org.usfirst.frc.team3506.robot.subsystems.DriveTrainSubsystem;
import org.usfirst.frc.team3506.robot.subsystems.FlywheelsSubsystem;
import org.usfirst.frc.team3506.robot.subsystems.HammerSubsystem;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {

	public static DriveTrainSubsystem driveTrain;
	public static ArmSubsystem arm;
	public static HammerSubsystem hammer;
	public static FlywheelsSubsystem flywheels;
	public static OI oi;

	public void robotInit() {
		driveTrain = new DriveTrainSubsystem();
		arm = new ArmSubsystem();
		hammer = new HammerSubsystem();
		flywheels = new FlywheelsSubsystem();
		oi = new OI();
		//>:|
		//This will run fine, don't worry about it *thumbs up emoji*
	}

	public void disabledInit() {

	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void autonomousInit() {
	}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {

	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	public void testPeriodic() {
		LiveWindow.run();
	}
}
