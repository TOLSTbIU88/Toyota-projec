package auto.typecar.carsobj;

import auto.typecar.Cabriolet;
import auto.typecar.carsobj.detail.Transmission;

public class Solara extends Cabriolet {


    public Solara(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo) {
        super(carPrice, carSpeed, carColor, transmission, isGo);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stoptMoving() {

    }

    public void miniFridge() {
        System.out.println("охладить напиток");

    }

}
