package com.company;

class Third extends Second {
    String txt;

    Third(int numero, char ch1, String txt){
        super(numero, ch1);
        this.txt = txt;
    }

    void setFields(int numero, char ch1, String txt){
        super.setFields(numero,ch1);
        this.txt = txt;
    }

    @Override
    public String toString(){
        return "Third " + "numero = " + numero + ", ch1 = " + ch1 + ", txt = " + txt;
    }
}
