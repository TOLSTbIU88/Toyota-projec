
import auto.typecar.carsobj.Camry;


public class Runner {
    public static void main(String[] args)  {
        try {
            Factory factory = new Factory(Country.JAPAN);
            LineCar lineCar = new LineCar(Country.JAPAN,factory);
            Camry camry = lineCar.createCamry("red",15000);
            camry.startMoving();
        } catch (CountyFactoryNotEqualException e) {
            e.printStackTrace();

        }

    }

}
