package ru.giocatory.Learn.Base;

public class ArraysInArrayForeach {
    public static void main(String[] args) {
        int[][] numbs = new int[3][4];
        int k = 0;
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                numbs[i][j] = k++;
            }
        }

        for (int[] num : numbs) {
            for (int number : num) {
                System.out.print(number + "\t");
                sum += number;
            }
            System.out.println();
        }

        System.out.println("Сумма всех чисел = " + sum);
    }
}
