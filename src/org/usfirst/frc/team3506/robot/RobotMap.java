package org.usfirst.frc.team3506.robot;

public class RobotMap {
	//Controller constants
	public static final int SHOOTER_STICK_PORT = 0;
	public static final int LEFT_STICK_PORT = 1;
	public static final int RIGHT_STICK_PORT = 2;
	public static final double DEAD_ZONE_MOD = 0.05;
	
	//Drive train constants
	public static final int LEFT_FRONT_TALON_PORT = 3;
	public static final int LEFT_BACK_TALON_PORT = 2;
	public static final int RIGHT_FRONT_TALON_PORT = 8;
	public static final int RIGHT_BACK_TALON_PORT = 7;
	
	//Arm talon constants
	public static final int LEFT_ARM_TALON_PORT = 1;
	public static final int RIGHT_ARM_TALON_PORT = 6;
	
	//Hammer
	public static final int HAMMER_FORWARD_SOLENOIDCHANNEL = 0;
	public static final int HAMMER_REVERSE_SOLENOIDCHANNEL = 1;
	public static final double HAMMER_TIMETOFIREBALL = 0.3;
	
	//Flywheels
	public static final int FLYWHEELS_TALON_PORT = 7;
	public static final double FLYWHEELS_TALON_SPEED = 0.8;
	public static final double FLYWHEELS_TIMETOFULLSPEED = 0.3;
}
