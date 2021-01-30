package Builder;

public class HumanoidRobot implements  RobotBuilder {
    Robot robot;
    public  HumanoidRobot(String name) {
        this.robot = new Robot(name);
    }

    @Override
    public void assembleArms() {
        this.robot.setArms("Arms set ");
    }

    @Override
    public void assembleLegs() {
        this.robot.setLegs("Legs assembled ");
    }

    @Override
    public void assembleSensors() {
        this.robot.setSensors("Sensors activated ");
    }

    @Override
    public Robot build() {
        return this.robot;
    }
}
