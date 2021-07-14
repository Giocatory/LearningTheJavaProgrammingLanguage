package ru.giocatory.Learn.OOP.ReturnObjectToNewValue.NewVersion;

public class NewCar {
    private final String machine;
    private double speed;

    NewCar(String car, double speed) {
        machine = car;
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getMachine() {
        return machine;
    }
}
