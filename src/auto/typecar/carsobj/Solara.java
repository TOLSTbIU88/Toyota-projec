package auto.typecar.carsobj;

import auto.typecar.Cabriolet;
import auto.typecar.carsobj.detail.Transmission;

public class Solara extends Cabriolet {


    public Solara(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo) {
        super(carPrice, carSpeed, carColor, transmission, isGo);
    }

    @Override
    public void startMoving() {
        System.out.println("машина опоехала");

    }

    @Override
    public void stoptMoving() {
        System.out.println("машина остановилась");

    }

    public void miniFridge() {
        System.out.println("охладить напиток");

    }

}
