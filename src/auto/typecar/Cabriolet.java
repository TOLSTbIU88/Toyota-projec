package auto.typecar;

import auto.Car;

public abstract class Cabriolet extends Car {


    public Cabriolet(float price) {
        super(price);
    }

    public Cabriolet(int speed) {
        super(speed);
    }

    public Cabriolet(String color) {
        super(color);
    }
}
