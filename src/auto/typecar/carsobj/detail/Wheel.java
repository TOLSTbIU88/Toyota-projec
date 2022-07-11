package auto.typecar.carsobj.detail;

public class Wheel extends Detail {

    private WheelRadius wheelRadius;


    public Wheel(boolean isWorkable,WheelRadius wheelRadius) {
        super(isWorkable);
    }

    public WheelRadius getWheelRadius() {
        return wheelRadius;
    }
}

