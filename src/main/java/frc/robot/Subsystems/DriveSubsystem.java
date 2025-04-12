package frc.robot.Subsystems;

import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.configs.TalonFXConfigurator;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.controls.MotionMagicVelocityVoltage;
import com.ctre.phoenix6.controls.MotionMagicVoltage;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

public class DriveSubsystem {
  public TalonFX rightWheelFrontFx = new TalonFX(0, "rio");
  public TalonFX leftWheelFrontFx = new TalonFX(1, "rio");
  public TalonFX rightWheelBackFx = new TalonFX(0, "rio");
  public TalonFX leftWheelBackFx = new TalonFX(0, "rio");
}
