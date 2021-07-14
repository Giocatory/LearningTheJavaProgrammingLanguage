package ru.giocatory.Learn.Base;

public class ASCII {
    public static void main(String[] args) {
        // a to z
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " - " + (int) (ch) + "\t");
        }
        System.out.println("\n");
        // A to Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " - " + (int) (ch) + "\t");
        }
        System.out.println("\n");
        // а до я
        for (char ch = 'а'; ch <= 'я'; ch++) {
            System.out.print(ch + " - " + (int) (ch) + "\t");
        }
        System.out.println("\n");
        // А до Я
        for (char ch = 'А'; ch <= 'Я'; ch++) {
            System.out.print(ch + " - " + (int) (ch) + "\t");
        }
        // all ascii symbols
        System.out.println("\n");
        for (int i = 0; i <= 65536; i++) {
            char code = (char) i;
            System.out.print(code + " - " + i + "\t");
        }
    }
}
