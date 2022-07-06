package auto.typecar.carsobj.detail;

import auto.StartCarException;

public class WeelCar {

    public boolean isPunctured;

    public WeelCar(boolean isPunctured) {
        this.isPunctured = isPunctured;
    }

    public boolean isPunctured() {
        return isPunctured;
    }

    public void setPunctured(boolean punctured) {
        isPunctured = punctured;
    }
}
