package auto.typecar.carsobj.detail;

import auto.StartCarException;

public abstract class Detail {

    private boolean isWorkable;


    public Detail(boolean isWorkable) {
        this.isWorkable = isWorkable;
    }

    public boolean isWorkable() {
        return isWorkable;
    }

    public void setWorkable(boolean workable) throws StartCarException {
        isWorkable = workable;
    }


}
