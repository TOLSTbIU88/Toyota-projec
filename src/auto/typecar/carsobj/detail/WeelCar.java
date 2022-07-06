package auto.typecar.carsobj.detail;

import auto.StartCarException;

public class WeelCar extends Detail{

    public boolean isPunctured;

    public WeelCar(boolean isWorkable) {
        super(isWorkable);
    }

    @Override
    public void setWorkable (boolean workable) {
        super.setWorkable(workable);
        if (isPunctured){
            throw new StartCarException(isPunctured);
        }else {

        }


    }
}
