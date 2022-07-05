package auto;

public abstract class Car {

    private double price;
    public abstract void run();

    public Car(double price) {
        this.price = price;
    }
}
