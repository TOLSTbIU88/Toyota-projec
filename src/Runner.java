import auto.StartCarException;
import auto.typecar.carsobj.Camry;
import auto.typecar.carsobj.Dyna;
import auto.typecar.carsobj.Hiance;
import auto.typecar.carsobj.Solara;
import auto.typecar.carsobj.detail.WeelCar;

public class Runner {
    public static void main(String[] args) {



//    }
//    public static void auto(){

        Camry camry = new Camry(100,150,"red");
        Solara solara = new Solara(100,130,"red");
        Hiance hiance = new Hiance(4000,50,"red");
        Dyna dyna = new Dyna(5000,50,"green");


        try {
            camry.startMoving();
        } catch (StartCarException e) {
            System.out.println(e);

        }
        camry.turnMuzik();
        solara.startMoving();
        solara.miniFridge();
        hiance.startMoving();

        dyna.startMoving();
        dyna.powerSocket();
        System.out.println(dyna.getWeelCar().isPunctured());




    }
}
