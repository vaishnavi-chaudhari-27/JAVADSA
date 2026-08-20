package OOPs.Inheritance;

public class MotorCycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;

    MotorCycle(String name, String model, int noOfTyres, String handleBarSStyle, String suspensionType) {
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarSStyle;
        this.suspensionType = suspensionType;
    }
    public void wheelie() {
        System.out.println("MotoCycle is doing wheelieee! " + name);
    }
}
