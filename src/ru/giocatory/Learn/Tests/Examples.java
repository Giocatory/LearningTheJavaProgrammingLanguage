package ru.giocatory.Learn.Tests;

public class Examples {
    public static void main(String[] args) {
        Integer num = 15;
        int num2 = 15;
        boolean b = (Object) num2 instanceof Integer;

        System.out.println(num.getClass());
        System.out.println(b);
    }
}
