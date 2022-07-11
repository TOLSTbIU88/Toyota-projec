package auto;

import auto.typecar.carsobj.detail.*;


public abstract class Car {

    private float carPrice;
    private int carSpeed;
    private String carColor;
    private Transmission transmission;
    private boolean isGo;

    private Wheel[] wheels;
    private GasTank gasTank;
    private Engine engine;
    private Electric electric;
    private Headlight headLight;


    public Car(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo, Wheel[] wheels,
               GasTank gasTank, Engine engine, Electric electric, Headlight headLight) throws StartCarException {
        this.carPrice = carPrice;
        this.carSpeed = carSpeed;
        this.carColor = carColor;
        this.transmission = transmission;
        this.isGo = isGo;
        this.wheels = wheels;
        this.gasTank = gasTank;
        this.engine = engine;
        this.electric = electric;
        this.headLight = headLight;
    }

    public abstract void startMoving() throws StartCarException;

    public void start() throws StartCarException {
        if (!checkWheels()) {
            throw new StartCarException("С колесами проблема");
        } else if (gasTank.getContPetrol() <= 0) {
            throw new StartCarException("Бензобак пустой");
        } else if (engine.isWorkable()) {
            throw new StartCarException("Двигатель сломан");
        } else if (electric.isWorkable()) {
            throw new StartCarException("Электрика сломана");
        } else if (headLight.isWorkable()) {
            throw new StartCarException("Фары сломаны");
        }

        this.isGo = true;

        }

        public void stop () {
            this.isGo = false;
        }

    public void onHeadligths() {
        if (!headLight.isWorkable()) {
            System.out.println("Включаем фары");
        }
    }

    public void checkCarHealth() {
        String result = "";
        if (!checkWheels()) {
            result += "С колесами проблема ";
        }
        if (gasTank.getContPetrol() <= 0) {
            result += "Бензобак пустой ";
        }
        if (engine.isWorkable()) {
            result += "Двигатель сломан ";
        }
        if (electric.isWorkable()) {
            result += "Электрика сломана ";
        }
        if (headLight.isWorkable()) {
            result += "Фары сломаны ";
        }
        if (!result.equals("")) {
            throw new RuntimeException(result);
        }
    }

    public boolean checkWheels() {
        if (wheels == null) {
            return false;
        } else if (wheels.length != 4) {
            return false;
        }


        for (Wheel wheel : wheels) {
            if (wheel.isWorkable()) {
                return false;
            }
        }
        return true;
    }
}
