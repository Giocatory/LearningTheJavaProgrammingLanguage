package ru.giocatory.Learn.Base;

public class ChristmasTreeWithOneLoop {
    public static void main(String[] args) {
        int i = 0;
        int max = 4; //к-во строк

        while (i < max) {
            String space = "";
            String star = "";
            for (int j = 0; j < max - i; j++){
                space += " ";
            }
            for (int k = 0; k < 2 * i + 1; k++){
                star += "*";
            }
            System.out.println(space + star);
            i++;
        }
    }
}