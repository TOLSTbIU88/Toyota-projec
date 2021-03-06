package auto.typecar.carsobj;

import auto.StartCarException;
import auto.typecar.CargoVan;
import auto.typecar.carsobj.detail.*;

public class Hiance extends CargoVan {

    private Wheel safeWheel;

    public Hiance(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo, Wheel[] wheels,
                  GasTank gasTank, Engine engine, Electric electric, Headlight headLight, int loadCapacity,Wheel safeWheel) {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheels, gasTank, engine, electric, headLight,
                loadCapacity);
        if (wheels[0].getWheelRadius() != WheelRadius.R20) {
            throw new RuntimeException("Радиус должен быть 20");
        }
        this.safeWheel = safeWheel;
    }

    @Override
    public void startMoving() {
        System.out.println("машина поехала");

    }

    @Override
    public void stoptMoving() {
        System.out.println("машина остановилась");

    }

    public void spareWheel() {
        System.out.println("использовать запасное колесо");

    }

}
