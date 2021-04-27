package ru.giocatory.Learn.OOP.Recursive.Factorial;

public class Factorial {

    static int calcRecursive(int number){
        int result;

        if (number == 1 || number == 0) return 1;
        result = calcRecursive(number - 1) * number;
        return result;
    }
    static int simpleMethod(int number){
        int multiply = 1;
        if (number == 0 || number == 1) return 1;
        for (int i = 1; i <= number; i++){
            multiply *= i;
        }
        return multiply;
    }
}
