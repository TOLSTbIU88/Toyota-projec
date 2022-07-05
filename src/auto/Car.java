package auto;

public abstract class Car implements StartCar {

    private double price;

    public Car(double price) {
        this.price = price;
    }
}
