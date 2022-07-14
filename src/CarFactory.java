import auto.typecar.Cabriolet;
import auto.typecar.CargoVan;
import auto.typecar.PassengerСar;
import auto.typecar.carsobj.Camry;

public interface CarFactory {
    Camry createCabriolet();
    CargoVan createCargoVan();
    PassengerСar createPassengerCar();
}
