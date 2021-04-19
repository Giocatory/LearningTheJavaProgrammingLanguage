package ru.giocatory.Learn.OOP.Box;

public class Box {
    private double width;
    private double height;
    private double depth;
    public static int howManyBoxesAreCreated;

    // constructor
    Box (){
        width = 0;
        height = 0;
        depth = 0;
        howManyBoxesAreCreated++;
    }
    Box (double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
        howManyBoxesAreCreated++;
    }
    // create square
    Box(double side){
        width = height = depth = side;
        howManyBoxesAreCreated++;
    }
    // GETTERS_AND_SETTERS
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // methods
    public double VolumeValue (){
        return width * height * depth;
    }
}
