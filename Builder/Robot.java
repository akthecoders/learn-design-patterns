package Builder;

public class Robot {
    private String name;
    private String arms;
    private String legs;
    private String sensors;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArms() {
        return arms;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getSensors() {
        return sensors;
    }

    public void setSensors(String sensors) {
        this.sensors = sensors;
    }
}
