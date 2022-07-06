package auto.typecar.carsobj;

import auto.typecar.CargoVan;

public class Dyna extends CargoVan {

    public Dyna(float carPrice, int carSpeed, String carColor) {
        super(carPrice, carSpeed, carColor);
    }



    @Override
    public void startMoving() {

    }


    public void powerSocket() {
        System.out.println("зарядить телефон");

    }

}
