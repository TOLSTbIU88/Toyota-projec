package auto.typecar.carsobj;

import auto.StartCarException;
import auto.typecar.CargoVan;
import auto.typecar.carsobj.detail.*;

public class Dyna extends CargoVan {

    private Socket socket;


    public Dyna(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo,
                Wheel[] wheels, GasTank gasTank, Engine engine, Electric electric, Headlight headLight,
                Socket socket) throws StartCarException {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheels, gasTank, engine, electric, headLight);
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
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
