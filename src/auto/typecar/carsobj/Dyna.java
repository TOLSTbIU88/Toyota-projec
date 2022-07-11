package auto.typecar.carsobj;

import auto.typecar.CargoVan;
import auto.typecar.carsobj.detail.Transmission;
import auto.typecar.carsobj.detail.Wheel;

public class Dyna extends CargoVan {


    public Dyna(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo, Wheel[] wheelset, int loadCapacity) {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheelset, loadCapacity);
    }

    @Override
    public void startMoving() {
        System.out.println("машина поехала");

    }

    @Override
    public void stoptMoving() {
        System.out.println("машина остановилась");

    }


    public void powerSocket() {
        System.out.println("зарядить телефон");

    }

}
