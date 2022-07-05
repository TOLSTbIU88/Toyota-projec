package auto.typecar.carsobj;

import auto.typecar.PassengerСar;

public class Camry extends PassengerСar {

    @Override
    public void run() {

    }

    public Camry(double price) {
        super(price);
    }

    public String USB() {
        return "функция подключить музыку!";
    }

}
