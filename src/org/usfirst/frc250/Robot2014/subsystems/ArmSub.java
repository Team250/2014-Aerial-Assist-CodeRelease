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

/**
 *
 */
public class ArmSub extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController pickUpWheelVictor = RobotMap.armSubpickUpWheelVictor;
    SpeedController armVictor = RobotMap.armSubarmVictor;
    DigitalInput armUpperLimit = RobotMap.armSubarmUpperLimit;
    DigitalInput armLowerLimit = RobotMap.armSubarmLowerLimit;
    DigitalInput pressureSwitch = RobotMap.armSubpressureSwitch;
    AnalogChannel pneumaticsAnalogInput = RobotMap.armSubpneumaticsAnalogInput;
    AnalogChannel potentiometer1 = RobotMap.armSubPotentiometer1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATION
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void moveArm(double speed) {
        armVictor.set(speed);
    }

    public void moveWheel(double speed) {
        pickUpWheelVictor.set(speed);
    }

    public void stopArm() {
        armVictor.set(0);
    }

    public void stopWheel() {
        pickUpWheelVictor.set(0);
    }

    public boolean isAtUpperLimit() {
        return armUpperLimit.get();
    }

    public boolean isAtLowerLimit() {
        return armLowerLimit.get();
    }

    public double getPotPosition() {
        return potentiometer1.getVoltage();
    }

    public double getTargetArmSpeed(double targetPosition) {
        double current = getPotPosition();
        if (Math.abs(current - targetPosition) < RobotMap.kArmTolerance) {
            return 0;
        } else if (current > targetPosition) {
            return RobotMap.kRaiseArmSpeed;
        } else if (current < targetPosition) {
            return RobotMap.kLowerArmSpeed;
        } else {
            return 0;
        }

    }

    public boolean isAtTargetPosition(double targetPosition) {
        double current = getPotPosition();
        if (getTargetArmSpeed(targetPosition) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
