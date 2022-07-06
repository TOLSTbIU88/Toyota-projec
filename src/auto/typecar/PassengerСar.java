package auto.typecar;

import auto.Car;

public abstract class PassengerСar extends Car {


    public PassengerСar(float price) {
        super(price);
    }

    public PassengerСar(int speed) {
        super(speed);
    }

    public PassengerСar(String color) {
        super(color);
    }
}
