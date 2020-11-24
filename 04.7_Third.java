package com.company;

public class Third extends Second{
    int numero;
    char ch1;
    String txt;

    Third(char ch1, String txt, int numero){
        super(ch1, txt);
        this.numero = numero;
    }

    Third(Third th){
        this(th.ch1, th.txt, th.numero);
    }

    @Override
    public String toString(){
        return "Third " + "numero = " + ", txt = " + txt + ", ch1 = " + ch1;
    }
}
