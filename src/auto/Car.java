package auto;

public abstract class Car {

    private float price;
    private int speed;
    private String color;

    public Car(float price) {
        this.price = price;
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public Car(String color) {
        this.color = color;
    }

    public abstract void startMoving();

}
