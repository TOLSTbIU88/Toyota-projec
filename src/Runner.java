import auto.StartCarException;
import auto.typecar.carsobj.Camry;
import auto.typecar.carsobj.Dyna;
import auto.typecar.carsobj.Hiance;
import auto.typecar.carsobj.Solara;
import auto.typecar.carsobj.detail.*;


public class Runner {
    public static void main(String[] args) throws StartCarException {

        GasTank gasTank = new GasTank(0);
        Engine engine = new Engine(true);
        Electric electrics = new Electric(true);
        Headlight headLigths = new Headlight(true);


        Camry camry = new Camry(10000,120,"red",Transmission.AUTO,false,
                Factory.createWheelsWithRadius(WheelRadius.R17),gasTank,engine,electrics,headLigths,new Usb());
        Solara solara = new Solara(14000,160,"gold",Transmission.ROBOT,false,
                Factory.createWheelsWithRadius(WheelRadius.R16),gasTank,engine,electrics,headLigths,new MiniFrigde());
        Hiance hiance = new Hiance(16000,60,"green",Transmission.MANUAL,false,
                Factory.createWheelsWithRadius(WheelRadius.R20),gasTank,engine,electrics,headLigths);
        Dyna dyna = new Dyna(18000,70,"black",Transmission.MANUAL,false,
                Factory.createWheelsWithRadius(WheelRadius.R20),gasTank,engine,electrics,headLigths,new Socket());

        camry.startMoving();
        solara.startMoving();
        hiance.startMoving();
        dyna.startMoving();

    }

}
