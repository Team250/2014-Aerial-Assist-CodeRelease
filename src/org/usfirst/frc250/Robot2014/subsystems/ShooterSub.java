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
public class ShooterSub extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Compressor shooterCompressor = RobotMap.shooterSubshooterCompressor;
    Solenoid shooterSolenoid1 = RobotMap.shooterSubshooterSolenoid1;
    Solenoid shooterSolenoid2 = RobotMap.shooterSubshooterSolenoid2;
    Solenoid shooterSolenoid3 = RobotMap.shooterSubshooterSolenoid3;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void shootAll() {
        shooterSolenoid3.set(true);
        shooterSolenoid1.set(true);
        shooterSolenoid2.set(true);
    }
    public void shootOne() {
        shooterSolenoid3.set(false);
        shooterSolenoid1.set(false);
        shooterSolenoid2.set(true);
    }
    public void shootTwo() {
        shooterSolenoid3.set(true);
        shooterSolenoid1.set(true);
        shooterSolenoid2.set(false);
    }
    public void retract() {
        shooterSolenoid3.set(false);
        shooterSolenoid1.set(false);
        shooterSolenoid2.set(false);
    }
    public void waitBeforeShoot(long time) {
        WaitCommand waitcommand = new WaitCommand(time);
        try {
            waitcommand.wait(time);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    public void compressorStart() {
        shooterCompressor.start();
    }
}
