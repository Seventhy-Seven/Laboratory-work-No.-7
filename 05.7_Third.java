package com.company;

public class Third extends First{
    protected char ch1;

    Third(String txt, char ch1){
        super(txt);
        this.ch1 = ch1;
    }

    void print(){
        System.out.println("class Third, text = " + txt + ", ch1 = " + ch1);
    }
}
