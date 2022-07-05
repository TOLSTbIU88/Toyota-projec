package auto.typecar.carsobj;

import auto.typecar.CargoVan;

public class Dyna extends CargoVan {
    @Override
    public void run() {

    }

    public Dyna(double price) {
        super(price);
    }

    public String powerSocket() {
        return "функция зарядить телефон";
    }

}
