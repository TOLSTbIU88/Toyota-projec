
import auto.typecar.carsobj.detail.*;

public class Factory  {

    private Country country;

    public Electric createElectric(){
        return new Electric(true);
    }

    public Engine createEngine(){
        return  new Engine( true);
    }

    public GasTank createGasTank() {
        return new GasTank(0);
    }

    public Headlight createHeadlight(){
        return new Headlight(true);
    }
    public MiniFrigde createMiniFridge() {
        return new MiniFrigde();
    }

    public Socket createSocket() {
        return new Socket();
    }

    public Usb createUsb() {
        return new Usb();
    }
    public Wheel createSafeWheel(WheelRadius wheelRadius) {
        return new Wheel(true, wheelRadius);
    }

    public Wheel[] createWheels(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(true, wheelRadius);
        }
        return wheels;
    }
    public Country getCountry() {
        return country;
    }
}
