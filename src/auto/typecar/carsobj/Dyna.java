package auto.typecar.carsobj;

import auto.StartCarException;
import auto.typecar.CargoVan;
import auto.typecar.carsobj.detail.*;

public class Dyna extends CargoVan {

    private Socket socket;


    public Dyna(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo, Wheel[] wheels,
                GasTank gasTank, Engine engine, Electric electric, Headlight headLight, int loadCapacity) {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheels, gasTank, engine, electric, headLight,
                loadCapacity, Socket socket);
        if (wheels[0].getWheelRadius() != WheelRadius.R20) {
            throw new RuntimeException("Радиус должен быть 20");
        }
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
