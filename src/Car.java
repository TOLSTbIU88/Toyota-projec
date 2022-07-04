public class Car {

    private int countGasTanks;
    private boolean engine;

    private boolean electrics;

    public Car(boolean engine) {
        this.engine = engine;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public Car(int countGasTanks) {
        this.countGasTanks = countGasTanks;
    }

    public int getCountGasTanks() {
        return countGasTanks;
    }

    public void setCountGasTanks(int countGasTanks) {
        this.countGasTanks = countGasTanks;
    }

    public static Camry NovCamry (){
        Camry camry = new Camry();
        return camry;
    }

    public static Solara NovSolara (){
        Solara solara = new Solara();
        return solara;
    }

    public static Hiance NovHiance (){
        Hiance hiance = new Hiance();
        return hiance;
    }

    public static Dyna NovDyna (){
        Dyna dyna = new Dyna();
        return dyna;
    }
}
