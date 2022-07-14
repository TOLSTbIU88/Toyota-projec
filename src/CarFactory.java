import auto.typecar.Cabriolet;
import auto.typecar.CargoVan;
import auto.typecar.PassengerСar;

public interface CarFactory {
    Cabriolet createCabriolet();
    CargoVan createCargoVan();
    PassengerСar createPassengerCar();
}
