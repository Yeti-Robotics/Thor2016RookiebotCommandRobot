package org.usfirst.frc.team3506.robot;

import edu.wpi.first.wpilibj.Relay.Value;

public class RobotMap {
	//Controller constants
	public static final int SHOOTER_STICK_PORT = 0;
	public static final int LEFT_STICK_PORT = 1;
	public static final int RIGHT_STICK_PORT = 2;
	public static final double DEAD_ZONE_MOD = 0.05;
	
	//Drive train constants
	public static final int LEFT_1_TALON_PORT = 8;
	public static final int LEFT_2_TALON_PORT = 7;
	public static final int LEFT_3_TALON_PORT = 4;
	public static final int RIGHT_1_TALON_PORT = 3;
	public static final int RIGHT_2_TALON_PORT = 2;
	public static final int RIGHT_3_TALON_PORT = 5;
	
	//Arm constants
	public static final int LEFT_ARM_TALON_PORT = 1;
	public static final int RIGHT_ARM_TALON_PORT = 6;
	public static final double ARM_MOD = 0.25;
	
	//Hammer constants
	public static final int HAMMER_FORWARD_SOLENOIDCHANNEL = 1;
	public static final int HAMMER_REVERSE_SOLENOIDCHANNEL = 0;
	public static final double HAMMER_TIMETOFIREBALL = 0.8;
	
	//Flywheels constants
	public static final int FLYWHEELS_TALON_PORT = 0;
	public static final double FLYWHEELS_SHOOT_SPEED = 1;
	public static final double FLYWHEELS_INTAKE_SPEED = 0.15;
	public static final double FLYWHEELS_TIMETOFULLSPEED = 1.25;
	
	//Intake constants
	public static final int INTAKE_BELT_SPIKE_PORT = 3;
	public static final int INTAKE_ROLLER_BAR_SPIKE_PORT = 2;
	public static final Value RUN_INTAKE_BELT_VALUE = Value.kReverse;
	public static final Value RUN_INTAKE_ROLLER_BAR_VALUE = Value.kReverse;
	public static final Value REVERSE_RUN_INTAKE_BELT_VALUE = Value.kForward;
	public static final Value REVERSE_RUN_INTAKE_ROLLER_BAR_VALUE = Value.kForward;
	public static final int INTAKE_PISTON_FORWARD = 2;
	public static final int INTAKE_PISTON_REVERSE = 3;
}
