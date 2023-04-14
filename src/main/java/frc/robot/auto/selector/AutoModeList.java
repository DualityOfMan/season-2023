package frc.robot.auto.selector;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.auto.modes.*;

public interface AutoModeList {
  public enum AutoModeListRed {
    DO_NOTHING(new DoNothing());
    // BARRIER_START(new BarrierStart("RED")),
    // MID_START(new MidStart("RED")),
    // BUMPER_START(new BumperStart("RED"));

    private final SequentialCommandGroup autoCommand;

    AutoModeListRed(SequentialCommandGroup autoCommand) {
      this.autoCommand = autoCommand;

    }

    public SequentialCommandGroup getAuto() {
      return autoCommand;
    }
  }

  public enum AutoModeListBlue {
    DO_NOTHING(new DoNothing());
    // BARRIER_START(new BarrierStart("BLUE")),
    // MID_START(new MidStart("BLUE")),
    // BUMPER_START(new BumperStart(""));

    private final SequentialCommandGroup autoCommand;

    AutoModeListBlue(SequentialCommandGroup autoCommand) {
      this.autoCommand = autoCommand;
    }

    public SequentialCommandGroup getAuto() {
      return autoCommand;
    }
  }
}
