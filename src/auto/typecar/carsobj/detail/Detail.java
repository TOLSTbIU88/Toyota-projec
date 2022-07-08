package auto.typecar.carsobj.detail;


public abstract class Detail {

    private boolean isWorkable;


    public Detail(boolean isWorkable) {
        this.isWorkable = isWorkable;
    }

    public boolean isWorkable() {
        return isWorkable;
    }

    public void setWorkable(boolean workable)  {
        isWorkable = workable;
    }


}
