package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.IO;
import frc.robot.subsystems.DriveTrain;

/**
 * ExampleCommand
 */
public class Commands {

    public static final DriveTrain drivetrain = new DriveTrain();
    public static final IO io = new IO();

  public static final Command drive = new RunCommand(() -> drivetrain.tankDrive(IO.driverController), drivetrain);
  public static final Command raiseArm = new InstantCommand();
}