package auto.typecar.carsobj.detail;

import auto.StartCarException;

public abstract class Detail {

    private boolean isWorkable;
    private int contPetrol;

    public Detail(int contPetrol) {
        this.contPetrol = contPetrol;
    }

    public Detail(boolean isWorkable) {
        this.isWorkable = isWorkable;
    }

    public boolean isWorkable() {
        return isWorkable;
    }

    public void setWorkable(boolean workable) throws StartCarException {
        isWorkable = workable;
    }

    public int getContPetrol() {
        return contPetrol;
    }

    public void setContPetrol(int contPetrol) {
        this.contPetrol = contPetrol;
    }
}
