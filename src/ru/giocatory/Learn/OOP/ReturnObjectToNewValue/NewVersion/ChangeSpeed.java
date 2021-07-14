package ru.giocatory.Learn.OOP.ReturnObjectToNewValue.NewVersion;

public class ChangeSpeed {
    public static void incrementSpeedToTen(NewCar speed) {
        double spd = speed.getSpeed() + 10.0;
        speed.setSpeed(spd);
    }

    public static NewCar incrementByTen(NewCar car) {
        return new NewCar(car.getMachine(), car.getSpeed() + 10);
    }
}
