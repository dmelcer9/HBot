package org.usfirst.frc810.HBot;

public class ProcessStick {
	


	public static double process(double value){
		if (Math.abs(value) < .2) value = 0;
		if (Robot.oi.getStick().getRawButton(1))value /= 3;
		return value;
	}
	
}
