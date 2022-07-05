package auto.typecar.carsobj;

import auto.typecar.Cabriolet;

public class Solara extends Cabriolet {
    @Override
    public void run() {

    }

    public Solara(double price) {
        super(price);
    }

    public String miniFridge() {
        return "функция охладить напиток";
    }

}
