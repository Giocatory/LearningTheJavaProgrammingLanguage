package ru.giocatory.Learn.Base;

public class FullTree {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0) {
                    if (j == 3) {
                        System.out.print("*");
                        continue;
                    }
                    System.out.print(" ");
                }
                //System.out.println();
                if (i == 1) {
                    if (j == 2 || j == 3 || j == 4) {
                        System.out.print("*");
                        continue;
                    }
                    System.out.print(" ");
                }
                //System.out.println();
                if (i == 2) {
                    if (j == 1 || j == 2 || j == 3 || j == 4 || j == 5) {
                        System.out.print("*");
                        continue;
                    }
                    System.out.print(" ");
                }
                //System.out.println();
                if (i == 3) {
                    System.out.print("*");
                }
                //System.out.println();
            }
            System.out.println();
        }
    }
}
