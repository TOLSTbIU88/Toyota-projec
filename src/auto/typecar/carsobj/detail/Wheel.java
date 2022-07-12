package auto.typecar.carsobj.detail;

public class Wheel extends Detail {

    private WheelRadius wheelRadius;


    public Wheel(boolean isWorkable,WheelRadius wheelRadius) {
        super(isWorkable);
        this.wheelRadius = wheelRadius;
    }

    public WheelRadius getWheelRadius() {
        return wheelRadius;
    }
}

