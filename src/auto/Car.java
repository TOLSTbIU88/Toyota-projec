package auto;

public abstract class Car {

    private float price;
    public abstract void startMoving();

    public Car(float price) {
        this.price = price;
    }
}
