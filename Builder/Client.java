package Builder;

public class Client {
    public static void main(String[] args) {
        RobotBuilder sophiaBuilder = new HumanoidRobot("Sophia");
        sophiaBuilder.assembleArms();
        sophiaBuilder.assembleLegs();
        sophiaBuilder.assembleSensors();
        Robot sophia = sophiaBuilder.build();
    }
}
