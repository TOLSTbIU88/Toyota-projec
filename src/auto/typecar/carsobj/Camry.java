package auto.typecar.carsobj;

import auto.typecar.PassengerСar;

public class Camry extends PassengerСar {


    public Camry(float carPrice, int carSpeed, String carColor) {
        super(carPrice, carSpeed, carColor);
    }



    public void turnMuzik() {
        System.out.println("подключить музыку");

    }

}
