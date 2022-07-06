package auto.typecar.carsobj;

import auto.typecar.Cabriolet;

public class Solara extends Cabriolet {


    public Solara(float carPrice, int carSpeed, String carColor) {
        super(carPrice, carSpeed, carColor);
    }

    @Override
    public void startMoving() {

    }

    public void miniFridge() {
        System.out.println("охладить напиток");

    }

}
