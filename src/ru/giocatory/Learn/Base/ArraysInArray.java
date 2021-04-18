package ru.giocatory.Learn.Base;

import java.util.Arrays;

public class ArraysInArray {
    public static void main(String[] args) {
        // массив состоит из 4 строк и 5 столбцов
        // просто двумерный массив
        int[][] twoRankArray = new int[4][5];
        int k = 0;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                twoRankArray[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(twoRankArray[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nArrays in Array:");
        // массив массивов
        int[][] arraysInArray = new int[5][];
        for (int i = 0; i < arraysInArray.length; i++){
            arraysInArray[i] = new int[5];
        }
        for (int i = 0; i < arraysInArray.length; i++){
            for (int j = 0; j < arraysInArray[i].length; j++){
                arraysInArray[i][j] = i+j+1;
            }
        }

        for (var arr:arraysInArray) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.printf("Под индексом {2;2} будет число: %d\n", arraysInArray[2][2]);

        // подсчет среднего числа
        int[] numbers = {1,2,3,4,5};
        int count = 0;
        int middleNum = 0;
        while (count < numbers.length){
            middleNum += numbers[count];
            count++;
        }
        System.out.println("\nСреднее значение: "+middleNum+"/"+numbers.length+"="+(middleNum/numbers.length));
    }
}
