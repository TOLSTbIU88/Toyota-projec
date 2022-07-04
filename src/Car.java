public class Car {

    private int countGasTanks;
    private boolean engine;
    private boolean electrics;
    private boolean headlights;


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
