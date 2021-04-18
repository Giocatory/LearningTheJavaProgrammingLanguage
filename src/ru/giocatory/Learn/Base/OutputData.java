package ru.giocatory.Learn.Base;

public class OutputData {
    public static void main(String[] args) {
        String myName = "Mike";
        String[] myNameLetters = myName.split("");
        String firstLetter = myNameLetters[0];

        System.out.printf("%.2f) В Имени %s, первая буква %s." +
                "\nM - в таблице ASCII №-%d", 1.255555,myName, firstLetter, (int)('M'));
    }
}