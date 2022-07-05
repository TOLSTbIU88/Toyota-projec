package auto.detail;

public abstract class Detail {

    private boolean isWorkable;
    private int contPetrol;

    public Detail(int contPetrol) {
        this.contPetrol = contPetrol;
    }

    public Detail(boolean isWorkable) {
        this.isWorkable = isWorkable;
    }
}
