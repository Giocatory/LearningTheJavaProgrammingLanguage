package ru.giocatory.Learn.OOP.AccessControl;

public class TestStack {
    public static void main(String[] args) {
        Stack myStackOne = new Stack();
        Stack myStackTwo = new Stack();
        // Place numbers in stack
        for (int i = 0; i < 10; i++){
            myStackOne.push(i);
        }
        for (int i = 10; i < 20; i++){
            myStackTwo.push(i);
        }
        // extract this numbers from stackOne
        System.out.println("Stack in \"myStackOne\":");
        for (int i = 0; i < 10; i++){
            System.out.println(myStackOne.pop());
        }
        // extract this numbers from stackTwo
        System.out.println("Stack in \"myStackTwo\":");
        for (int i = 0; i < 10; i++){
            System.out.println(myStackTwo.pop());
        }
    }
}
