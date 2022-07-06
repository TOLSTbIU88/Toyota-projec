package auto;

import auto.typecar.carsobj.detail.WeelCar;

public abstract class Car {

    private float carPrice;
    private int carSpeed;
    private String carColor;

    public WeelCar getWeelCar() {
        return weelCar;
    }

    private WeelCar weelCar = new WeelCar(true);

    public String getCarColor() {
        return carColor;
    }

    public Car(float carPrice, int carSpeed, String carColor) {
        this.carPrice = carPrice;
        this.carSpeed = carSpeed;
        this.carColor = carColor;
    }

    public float getCarPrice() {
        return carPrice;
    }

    public void startMoving() throws StartCarException {
        if (weelCar.isPunctured){
            throw new StartCarException("колесо проколото");

        }

        if (carPrice == (float)100) {
            throw new StartCarException("цена говно");
        }
    }



}
