package ru.giocatory.Learn.OOP.Recursive.PrintArray;

public class RecArray {
    private int[] values;
    public int[] getValues() {
        return values;
    }

    RecArray(int i){
        values = new int[i];
    }

    // Вывести рекурсивно элементы массива
    // List elements of an array recursively
    void printArray(int i){
        if (i == 0) return;
        else printArray(i-1);
        System.out.println("("+(i-1)+") "+values[i-1]);
    }
}
