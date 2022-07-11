import auto.typecar.carsobj.Camry;
import auto.typecar.carsobj.Dyna;
import auto.typecar.carsobj.Hiance;
import auto.typecar.carsobj.Solara;
import auto.typecar.carsobj.detail.Transmission;


public class Runner {
    public static void main(String[] args) {


        Camry camry = new Camry(8000,150,"blue",Transmission.ROBOT,false,(),true);
        Solara solara = new Solara(10000,130,"white",Transmission.AUTO,false);
        Hiance hiance = new Hiance(4000,50,"red",Transmission.MANUAL,false);
        Dyna dyna = new Dyna(5000,50,"green", Transmission.MANUAL,false);

        camry.stoptMoving();
        camry.startMoving();
        camry.();
        solara.startMoving();
        solara.stoptMoving();
        solara.miniFridge();
        hiance.startMoving();
        hiance.stoptMoving();
        hiance.spareWheel();
        dyna.startMoving();
        dyna.powerSocket();
        dyna.stoptMoving();


    }


}
