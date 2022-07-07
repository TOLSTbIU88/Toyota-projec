package auto.typecar.carsobj;

import auto.typecar.CargoVan;
import auto.typecar.carsobj.detail.Transmission;

public class Dyna extends CargoVan {


    public Dyna(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo) {
        super(carPrice, carSpeed, carColor, transmission, isGo);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stoptMoving() {

    }


    public void powerSocket() {
        System.out.println("зарядить телефон");

    }

}
