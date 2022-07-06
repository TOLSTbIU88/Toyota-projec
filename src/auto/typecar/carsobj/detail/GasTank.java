package auto.typecar.carsobj.detail;

public class GasTank extends Detail{

    private int contPetrol;

    public GasTank(boolean isWorkable, int contPetrol) {
        super(isWorkable);
        this.contPetrol = contPetrol;
    }

    public int getContPetrol() {
        return contPetrol;
    }

}
