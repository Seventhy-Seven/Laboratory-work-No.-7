package com.company;

public class First {
    char ch1;
    First(char ch1){
        this.ch1 = ch1;
    }

    First(First fr){
        this(fr.ch1);
    }

    @Override
    public String toString(){
        return "First " + "ch1 = " + ch1;
    }
}
