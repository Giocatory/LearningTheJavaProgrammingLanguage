package ru.giocatory.Learn.OOP.ReturnObject;

public class ClassIncrement {
    private final int a;

    ClassIncrement (int firstValue){
        a = firstValue;
    }

    public int getA() {
        return a;
    }

    ClassIncrement incrementByTen(){
        return new ClassIncrement(getA()+10);
    }
}
