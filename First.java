package com.company;

public class First {

    int numero;

    First(int numero){
        this.numero = numero;
    }

    void setNumero(int NewNumero){
        numero = NewNumero;
    }

    @Override
    public String toString(){
        return "First " + "numero = " + numero;
    }
}
