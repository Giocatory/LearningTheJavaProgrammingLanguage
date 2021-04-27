package ru.giocatory.Learn.OOP.Recursive.Factorial;

public class factorialCalculation {
    public static void main(String[] args) {
        // Calculating the factorial using the recursive method
        System.out.println("Факториал 0 равен " + Factorial.calcRecursive(0));
        System.out.println("Факториал 1 равен " + Factorial.calcRecursive(1));
        System.out.println("Факториал 3 равен " + Factorial.calcRecursive(3));
        System.out.println("Факториал 4 равен " + Factorial.calcRecursive(4));
        System.out.println("Факториал 5 равен " + Factorial.calcRecursive(5));
        System.out.println();

        // Calculating the factorial by a simple method
        System.out.println("Факториал 0 равен " + Factorial.simpleMethod(0));
        System.out.println("Факториал 1 равен " + Factorial.simpleMethod(1));
        System.out.println("Факториал 3 равен " + Factorial.simpleMethod(3));
        System.out.println("Факториал 4 равен " + Factorial.simpleMethod(4));
        System.out.println("Факториал 5 равен " + Factorial.simpleMethod(5));
        System.out.println();
    }
}
