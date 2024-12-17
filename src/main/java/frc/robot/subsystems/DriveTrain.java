

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {

  private TalonFX leftMotor = new TalonFX(4);
  private TalonFX rightMotor = new TalonFX(5);

  public DriveTrain() {
`
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
