package com.company;

public class Second extends First{
    protected int numero;

    Second(String txt, int numero){
        super(txt);
        this.numero = numero;
    }

    void print(){
        System.out.println("class Second, text = " + txt + ", numero = " + numero);
    }
}
