package auto;

public abstract class Car {

    private float carPrice;
    private int carSpeed;
    private String carColor;

    public Car(float price) {
        this.carPrice = price;
    }

    public Car(int speed) {
        this.carSpeed = speed;
    }

    public Car(String color) {
        this.carColor = color;
    }


    public abstract void startMoving();

}
