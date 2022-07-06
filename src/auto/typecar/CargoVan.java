package auto.typecar;

import auto.Car;

public abstract class CargoVan extends Car {


    public CargoVan(float price) {
        super(price);
    }

    public CargoVan(int speed) {
        super(speed);
    }

    public CargoVan(String color) {
        super(color);
    }
}
