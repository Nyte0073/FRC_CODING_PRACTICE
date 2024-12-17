

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {

  private Victor leftMotor = new Victor(Constants.LEFT_MOTOR);
  private Victor rightMotor = new Victor(Constants.RIGHT_MOTOR);

  public DriveTrain() {
    
  }

  private DifferentialDrive differentialDrive = new DifferentialDrive(leftMotor, rightMotor);

  public void tankDrive(XboxController driverController) {
    double leftSpeed = driverController.getLeftY();
    double rightSpeed = driverController.getRightY();
    differentialDrive.tankDrive(leftSpeed, rightSpeed);
  }

  public void stop() {
    differentialDrive.stopMotor();
  }

  public double getSpeed() {
    return leftMotor.get();
  }


}
