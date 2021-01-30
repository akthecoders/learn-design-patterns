package Builder;

interface RobotBuilder {
    void assembleArms();
    void assembleLegs();
    void assembleSensors();
    Robot build();
}
