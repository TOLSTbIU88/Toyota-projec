package auto.typecar.carsobj;

import auto.typecar.Cabriolet;

public class Solara extends Cabriolet {
    public Solara(float price) {
        super(price);
    }

    public Solara(int speed) {
        super(speed);
    }

    public Solara(String color) {
        super(color);
    }

    @Override
    public void startMoving() {

    }

    public void miniFridge() {
        System.out.println("охладить напиток");

    }

}
