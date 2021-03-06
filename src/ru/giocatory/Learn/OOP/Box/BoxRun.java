package ru.giocatory.Learn.OOP.Box;

import static ru.giocatory.Learn.OOP.Box.Box.howManyBoxesAreCreated;

public class BoxRun {
    public static void main(String[] args) {
        // One Box
        Box oneBox = new Box();
        System.out.println("Box1:\nWidth-" + oneBox.getWidth() + "\nHeight-" + oneBox.getHeight() +
                "\nDepth-" + oneBox.getDepth()); // all fields null
        oneBox.setWidth(3);
        oneBox.setHeight(6);
        oneBox.setDepth(9);
        System.out.println("Box1 new:\nWidth-" + oneBox.getWidth() + "\nHeight-" + oneBox.getHeight() +
                "\nDepth-" + oneBox.getDepth());
        System.out.println();
        ////////////////////////////////////////////////////


        // Two Box
        Box twoBox = new Box(10, 20, 15);
        System.out.println("Box2:\nWidth-" + twoBox.getWidth() + "\nHeight-" + twoBox.getHeight() +
                "\nDepth-" + twoBox.getDepth());
        twoBox.setWidth(11);
        twoBox.setHeight(21);
        twoBox.setDepth(16);
        System.out.println("Box2 new:\nWidth-" + twoBox.getWidth() + "\nHeight-" + twoBox.getHeight() +
                "\nDepth-" + twoBox.getDepth());
        System.out.println();
        /////////////////////////////////////////////////////


        // use method from class Box
        System.out.println("Объем box1: " + oneBox.VolumeValue());
        System.out.println("Объем box2: " + twoBox.VolumeValue());
        System.out.println();

        // create square
        Box square = new Box(20);
        System.out.println("Квадрат со сторонами равными - " + square.getHeight());
        System.out.println("Объем квадрата: " + square.VolumeValue());

        //Use static field in class Box
        System.out.println("\nВсего было создано: " + howManyBoxesAreCreated + " Объекта.");
    }
}
