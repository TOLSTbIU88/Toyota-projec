import auto.typecar.carsobj.Camry;
import auto.typecar.carsobj.Dyna;
import auto.typecar.carsobj.Hiance;
import auto.typecar.carsobj.Solara;
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
        Electric electric = factory.createElectric();
        Engine engine = factory.createEngine();
        GasTank gasTank = factory.createGasTank();
        Headlight headLights = factory.createHeadlight();

        Wheel[] wheels = factory.createWheels(WheelRadius.R17);
        Usb usb = factory.createUsb();

        return new Camry(20000,200,"red",Transmission.AUTO,
                true,wheels,gasTank,engine,electric,headLights,true,usb);
    }

    public Solara createSolara(String color, float price) {
        Electric electric = factory.createElectric();
        Engine engine = factory.createEngine();
        GasTank gasTank = factory.createGasTank();
        Headlight headLights = factory.createHeadlight();

        Wheel[] wheels = factory.createWheels(WheelRadius.R16);
        MiniFrigde miniFrigde = factory.createMiniFridge();

        return new Solara(25000,150,"red",Transmission.ROBOT,
                true,wheels,gasTank,engine,electric,headLights,true,miniFrigde);
    }
    public Dyna createDyna(String color, float price) {
        Electric electric = factory.createElectric();
        Engine engine = factory.createEngine();
        GasTank gasTank = factory.createGasTank();
        Headlight headLights = factory.createHeadlight();

        Wheel[] wheels = factory.createWheels(WheelRadius.R20);
        Socket socket = factory.createSocket();

        return new Dyna(35000,60,"red",Transmission.MANUAL,
                true,wheels,gasTank,engine,electric,headLights,5000,socket);
    }
    public Hiance createHiance(String color, float price) {
        Electric electric = factory.createElectric();
        Engine engine = factory.createEngine();
        GasTank gasTank = factory.createGasTank();
        Headlight headLights = factory.createHeadlight();

        Wheel[] wheels = factory.createWheels(WheelRadius.R20);
        Wheel safeWheel = factory.createSafeWheel(WheelRadius.R20);

        return new Hiance(35000,60,"red",Transmission.MANUAL,
                true,wheels,gasTank,engine,electric,headLights,5000,safeWheel);

}
