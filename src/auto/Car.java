package auto;

import auto.typecar.carsobj.detail.Transmission;


public abstract class Car {

    private float carPrice;
    private int carSpeed;
    private String carColor;
    private Transmission transmission;
    private boolean isGo;


    public Car(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo) {
        this.carPrice = carPrice;
        this.carSpeed = carSpeed;
        this.carColor = carColor;
        this.transmission = transmission;
        this.isGo = isGo;
    }

    public float getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(float carPrice) {
        this.carPrice = carPrice;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public boolean isGo() {
        return isGo;
    }

    public void setGo(boolean go) {
        isGo = go;
    }

    public abstract void startMoving();

    public abstract void stoptMoving();

}
