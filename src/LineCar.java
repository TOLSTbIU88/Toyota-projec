import auto.typecar.carsobj.Camry;
import auto.typecar.carsobj.detail.*;

public class LineCar {

    private Country country;

    public Factory factory;

    public LineCar(Country country, Factory factory) throws CountyFactoryNotEqualException {
        if (country != factory.getCountry())
            throw new CountyFactoryNotEqualException("Ошибка :Фабрика находиться в" + factory.getCountry()
                    + "а конвеер в" +  country);
        this.country = country;
        this.factory = factory;
    }

    public Camry createCamry(String color, float price) {
        Electric electric = Factory.createElectric();
        Engine engine = Factory.createEngine();
        GasTank gasTank = Factory.createGasTank();
        Headlight headLights = Factory.createHeadlight();

        Wheel[] wheels = Factory.createWheels(WheelRadius.R17);
        Usb usb = Factory.createUsb();

        return new Camry(color, 250, Transmission.AUTO, false, price, gasTank, engine,
                electric, headLights, wheels, false, usb);
    }


}
