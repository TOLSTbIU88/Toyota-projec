public abstract class Car  {

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

}
