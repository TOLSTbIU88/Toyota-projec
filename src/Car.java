public class Car {

    private int countGasTanks;
    private boolean engine;
    private boolean electrics;
    private boolean headlights;

    public Car(int countGasTanks, boolean engine, boolean electrics, boolean headlights) {
        this.countGasTanks = countGasTanks;
        this.engine = engine;
        this.electrics = electrics;
        this.headlights = headlights;
    }

    public int getCountGasTanks() {
        return countGasTanks;
    }

    public void setCountGasTanks(int countGasTanks) {
        this.countGasTanks = countGasTanks;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public boolean isElectrics() {
        return electrics;
    }

    public void setElectrics(boolean electrics) {
        this.electrics = electrics;
    }

    public boolean isHeadlights() {
        return headlights;
    }

    public void setHeadlights(boolean headlights) {
        this.headlights = headlights;
    }

    public static PassengerСar NovCamry (){
        PassengerСar camry = new PassengerСar();
        return camry;
    }

    public static Cabriolet NovSolara (){
        Cabriolet solara = new Cabriolet();
        return solara;
    }

    public static CargoVan NovHiance (){
        CargoVan hiance = new CargoVan();
        return hiance;
    }

    public static CargoVan NovDyna (){
        CargoVan dyna = new CargoVan();
        return dyna;
    }
}
