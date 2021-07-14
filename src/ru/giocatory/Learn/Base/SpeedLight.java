package ru.giocatory.Learn.Base;

public class SpeedLight {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        lightSpeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightSpeed * seconds;

        System.out.println("За " + days + " дней, свет пройдет около " + distance + " миль.");
    }
}
