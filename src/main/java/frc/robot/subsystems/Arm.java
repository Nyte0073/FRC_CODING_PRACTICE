package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
    private DoubleSolenoid armSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);
    private Compressor compressor = new Compressor(PneumaticsModuleType.CTREPCM);

    public void extend() {
        armSolenoid.set(Value.kForward);
    }

    public void retract() {
        armSolenoid.set(Value.kReverse);
    }

    public void toggleSolenoid() {
        armSolenoid.toggle();
    }

    public void start() {
        compressor.enableDigital();
    }

    public boolean isCompressorEnabled() {
        return compressor.isEnabled();
    }

}
