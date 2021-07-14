package ru.giocatory.Learn.OOP.ReturnObjectToNewValue.NewVersion;

public class CarsSpeed {
    public static void main(String[] args) {
        NewCar niva = new NewCar("Chevrolet", 120);

        // first value in create object from class NewCar...
        System.out.println("Car:\nModel - " + niva.getMachine() + "\nMax speed - " + niva.getSpeed());

        // change field from class NewCar...
        ChangeSpeed.incrementSpeedToTen(niva);
        System.out.println("Car:\nModel - " + niva.getMachine() + "\nMax speed - " + niva.getSpeed());

        // Re Create object from class NewCar...
        niva = ChangeSpeed.incrementByTen(niva);
        System.out.println("Car:\nModel - " + niva.getMachine() + "\nMax speed - " + niva.getSpeed());
    }
}
