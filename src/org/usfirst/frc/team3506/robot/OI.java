package org.usfirst.frc.team3506.robot;

import org.usfirst.frc.team3506.robot.commandgroups.FireBallCommandGroup;
import org.usfirst.frc.team3506.robot.commands.drivetrain.SetControlTypeToArcadeCommand;
import org.usfirst.frc.team3506.robot.commands.drivetrain.SetControlTypeToTankCommand;
import org.usfirst.frc.team3506.robot.commands.drivetrain.ToggleRobotFrontCommand;
import org.usfirst.frc.team3506.robot.commands.flywheels.StartFlywheelsCommand;
import org.usfirst.frc.team3506.robot.commands.hammer.FireHammerCommandGroup;
import org.usfirst.frc.team3506.robot.commands.hammer.ThrowHammerDownCommand;
import org.usfirst.frc.team3506.robot.commands.hammer.ThrowHammerUpCommand;
import org.usfirst.frc.team3506.robot.commands.intake.ExtendIntakePiston;
import org.usfirst.frc.team3506.robot.commands.intake.RetractIntakePiston;
import org.usfirst.frc.team3506.robot.commands.intake.RunIntakeCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

public class OI {
	public Joystick shooterStick;
	private Joystick rightStick;
	private Joystick leftStick;

	public OI() {
		shooterStick = new Joystick(RobotMap.SHOOTER_STICK_PORT);
		leftStick = new Joystick(RobotMap.LEFT_STICK_PORT);
		rightStick = new Joystick(RobotMap.RIGHT_STICK_PORT);

		// Right Stick
		setJoystickButtonWhenPressedCommand(rightStick, 1, new ToggleRobotFrontCommand());
		setJoystickButtonWhenPressedCommand(rightStick, 4, new SetControlTypeToTankCommand());
		setJoystickButtonWhenPressedCommand(rightStick, 5, new SetControlTypeToArcadeCommand());
		
		//Shooter stick
		setJoystickButtonWhilePressedCommand(shooterStick, 2, new RunIntakeCommand());
		setJoystickButtonWhenPressedCommand(shooterStick, 4, new RetractIntakePiston());
		setJoystickButtonWhenPressedCommand(shooterStick, 5, new ExtendIntakePiston());
		setJoystickButtonWhenPressedCommand(shooterStick, 1, new FireBallCommandGroup());
	}

	public double getShooterY() {
		if (!(shooterStick == null)) {
			return deadZoneMod(shooterStick.getY());
		} else {
			return 0;
		}
	}

	public double getLeftX() {
		if (!(rightStick == null)) {
			return deadZoneMod(rightStick.getX());
		} else {
			return 0;
		}
	}

	public double getRightX() {
		if (!(leftStick == null)) {
			return deadZoneMod(leftStick.getX());
		} else {
			return 0;
		}
	}

	//The Y's are inverted in here because up = positive makes sense
	public double getLeftY() {
		if (!(rightStick == null)) {
			return -deadZoneMod(rightStick.getY());
		} else {
			return 0;
		}
	}

	public double getRightY() {
		if (!(leftStick == null)) {
			return -deadZoneMod(leftStick.getY());
		} else {
			return 0;
		}
	}

	private double deadZoneMod(double val) {
		if (Math.abs(val) <= RobotMap.DEAD_ZONE_MOD) {
			return 0;
		} else {
			return val;
		}
	}

	public boolean getButtonStatus(Joystick joystick, int button) {
		return joystick.getRawButton(button);
	}

	public Joystick getShooter() {
		return shooterStick;
	}

	private void setJoystickButtonWhenPressedCommand(Joystick joystick, int button, Command command) {
		new JoystickButton(joystick, button).whenPressed(command);
	}

	private void setJoystickButtonWhilePressedCommand(Joystick joystick, int button, Command command) {
		new JoystickButton(joystick, button).whileHeld(command);
	}

}
