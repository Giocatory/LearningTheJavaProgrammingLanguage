package ru.giocatory.Learn.OOP.Recursive.PrintArray;

public class PrintArray {
    public static void main(String[] args) {
        RecArray obj = new RecArray(10);

        for (int i = 0; i < 10; i++) {
            obj.getValues()[i] = i;
        }
        // Use recursive method
        obj.printArray(10);
    }
}
