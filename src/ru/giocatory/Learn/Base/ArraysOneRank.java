package ru.giocatory.Learn.Base;

public class ArraysOneRank {
    enum nameMonth{
        январь, февраль, март, арель, май, июнь, июль, август, сентябрь, октябрь, ноябрь, декабрь
    }
    public static void main(String[] args) {
        String[] month = new String[12];
        for (int i = 0; i < month.length; i++){
            switch (i) {
                case 0 -> month[i] = String.valueOf(nameMonth.январь);//31
                case 1 -> month[i] = String.valueOf(nameMonth.февраль);//28
                case 2 -> month[i] = String.valueOf(nameMonth.март);//31
                case 3 -> month[i] = String.valueOf(nameMonth.арель);//30
                case 4 -> month[i] = String.valueOf(nameMonth.май);//31
                case 5 -> month[i] = String.valueOf(nameMonth.июнь);//30
                case 6 -> month[i] = String.valueOf(nameMonth.июль);//31
                case 7 -> month[i] = String.valueOf(nameMonth.август);//31
                case 8 -> month[i] = String.valueOf(nameMonth.сентябрь);//30
                case 9 -> month[i] = String.valueOf(nameMonth.октябрь);//31
                case 10 -> month[i] = String.valueOf(nameMonth.ноябрь);//30
                default -> month[month.length-1] = String.valueOf(nameMonth.декабрь);//31
            }
        }
        for (int i = 0; i < month.length; i++){
            System.out.print((i+1)+" месяц - " + month[i]);
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11){
                System.out.println(" - в нем 31 день.");
            }
            else if(i == 1){
                System.out.println(" - в нем 28 или 29 дней, в зависимости от года.");
            }
            else{
                System.out.println(" - в нем 30 дней.");
            }
        }
    }
}
