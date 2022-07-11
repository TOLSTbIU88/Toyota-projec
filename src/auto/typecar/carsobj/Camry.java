package auto.typecar.carsobj;

import auto.typecar.PassengerСar;
import auto.typecar.carsobj.detail.Transmission;
import auto.typecar.carsobj.detail.Wheel;


public class Camry extends PassengerСar {


    public Camry(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo, Wheel[] wheelset, boolean cruise) {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheelset, cruise);
    }

    public void turnMuzik() {
        System.out.println("подключить музыку");

    }


    @Override
    public void startMoving() {
        System.out.println("машина поехала");

    }

    @Override
    public void stoptMoving() {
        System.out.println("машина остановилась");

    }
}
