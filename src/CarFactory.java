import auto.typecar.Cabriolet;
import auto.typecar.CargoVan;
import auto.typecar.PassengerСar;
import auto.typecar.carsobj.Camry;
import auto.typecar.carsobj.Dyna;
import auto.typecar.carsobj.Hiance;
import auto.typecar.carsobj.Solara;

public interface CarFactory {
    Camry createCamry();
    Dyna createDyna();
    Hiance createHiance();
    Solara createSolara();
}
