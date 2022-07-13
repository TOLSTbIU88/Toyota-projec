import auto.typecar.carsobj.detail.Wheel;
import auto.typecar.carsobj.detail.WheelRadius;

public class Factory {
    public static Wheel[] createWheelsWithRadius(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(false, wheelRadius);
        }
        return wheels;
    }
}
