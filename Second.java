package com.company;

public class Second extends First{
    String txt;
    char ch2;

    Second(char ch1, String txt){
        super(ch1);
        this.txt = txt;
    }
    Second(Second sec){
        this(sec.ch2, sec.txt);
    }

    @Override
    public String toString(){
        return "Second " + "txt = " + txt + ", ch1 = " + ch2;
    }
}
