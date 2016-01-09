// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc250.Robot2014.subsystems;
import org.usfirst.frc250.Robot2014.RobotMap;
import org.usfirst.frc250.Robot2014.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.command.WaitCommand;
/**
 *
 */
public class MechanicsAlertSystem extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Solenoid sound = RobotMap.mechanicsAlertSystemsound;
    DigitalOutput soundSomthing = RobotMap.mechanicsAlertSystemsoundSomthing;
    AnalogChannel soundPot = RobotMap.mechanicsAlertSystemsoundPot;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    WaitCommand wait = new WaitCommand(.25);
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void startSound() {
        sound.set(true);
        
    }
    public void stopSound() {
        sound.set(false);
    }
}
