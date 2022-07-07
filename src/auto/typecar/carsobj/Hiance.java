package auto.typecar.carsobj;

import auto.typecar.CargoVan;
import auto.typecar.carsobj.detail.Transmission;

public class Hiance extends CargoVan {


    public Hiance(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo) {
        super(carPrice, carSpeed, carColor, transmission, isGo);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stoptMoving() {

    }

    public void spareWheel() {
        System.out.println("использовать запасное колесо");

    }

}
