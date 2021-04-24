package ru.giocatory.Learn.OOP.ReturnObjectToNewValue;

public class ReturnObjectValue {
    public static void main(String[] args) {
        ClassIncrement objectOne = new ClassIncrement(5);
        ClassIncrement objectTwo = objectOne.incrementByTen();

        System.out.println("Object one.a: "+objectOne.getA());
        System.out.println("Object two.a: "+objectTwo.getA());

        objectTwo = objectTwo.incrementByTen();
        System.out.println("Второе увеличение Object two.a: "+objectTwo.getA());

        objectOne = objectOne.incrementByTen();
        System.out.println("Второе увеличение Object one.a: "+objectOne.getA());
    }
}
