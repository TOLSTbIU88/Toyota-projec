package auto.typecar.carsobj;

import auto.StartCarException;
import auto.typecar.PassengerСar;
import auto.typecar.carsobj.detail.*;


public class Camry extends PassengerСar {

    private Usb usb;

    public Camry(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo,
                 Wheel[] wheels, GasTank gasTank, Engine engine, Electric electric, Headlight headLight,Usb usb) {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheels, gasTank, engine, electric, headLight);

        this.usb = usb;
    }


    public Usb getUsb() {
        return usb;
    }

    @Override
    public void startMoving() {
        System.out.println("машина поехала");

    }

    @Override
    public void stoptMoving() {
        System.out.println("машина остановилась");

    }
}
