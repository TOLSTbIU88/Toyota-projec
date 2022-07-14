
import auto.typecar.carsobj.Camry;
import auto.typecar.carsobj.Dyna;
import auto.typecar.carsobj.Hiance;
import auto.typecar.carsobj.Solara;
import auto.typecar.carsobj.detail.*;

public class Factory implements CarFactory {

    private Country country;

    public Electric createElectric(){
        return new Electric(true);
    }

    public Engine createEngine(){
        return  new Engine( true);
    }

    public GasTank createGasTank() {
        return new GasTank(0);
    }

    public Headlight createHeadlight(){
        return new Headlight(true);
    }



    public static Wheel[] createWheelsWithRadius(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(true, wheelRadius);
        }
        return wheels;
    }

    @Override
    public Camry createCamry() {
        return new Camry();
    }

    @Override
    public Dyna createDyna() {
        return new Dyna();
    }

    @Override
    public Hiance createHiance() {
        return new Hiance();
    }

    @Override
    public Solara createSolara() {
        return new Solara();
    }
}
