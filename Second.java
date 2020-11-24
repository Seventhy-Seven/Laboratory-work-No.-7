package com.company;

class Second extends First {
    char ch1;

    Second(int numero, char ch1){
        super(numero);
        this.ch1 = ch1;
    }

    void setFields(int numero, char ch1){
        super.setNumero(numero);
        this.ch1 = ch1;
    }

    @Override
    public String toString(){
        return "Second " + "numero = " + numero + ", ch1 = " + ch1;
    }
}
