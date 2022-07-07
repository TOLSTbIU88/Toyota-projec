package auto.typecar.carsobj;

import auto.typecar.CargoVan;
import auto.typecar.carsobj.detail.Transmission;

public class Hiance extends CargoVan {


    public Hiance(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo) {
        super(carPrice, carSpeed, carColor, transmission, isGo);
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
