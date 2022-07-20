import auto.typecar.carsobj.Camry;

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

}
