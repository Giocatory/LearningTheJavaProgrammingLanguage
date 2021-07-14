package ru.giocatory.Learn.OOP.Recursive.PrintArray;

public class RecArray {
    private int[] values;

    RecArray(int i) {
        values = new int[i];
    }

    public int[] getValues() {
        return values;
    }

    // Вывести рекурсивно элементы массива
    // List elements of an array recursively
    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("(" + (i - 1) + ") " + values[i - 1]);
    }
}
