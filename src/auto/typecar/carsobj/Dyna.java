package auto.typecar.carsobj;

import auto.typecar.CargoVan;

public class Dyna extends CargoVan {
    public Dyna(float price) {
        super(price);
    }

    public Dyna(int speed) {
        super(speed);
    }

    public Dyna(String color) {
        super(color);
    }

    @Override
    public void startMoving() {

    }


    public void powerSocket() {
        System.out.println("зарядить телефон");

    }

}
