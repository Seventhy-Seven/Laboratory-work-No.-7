package com.company;

public class Main {

    public static void main(String[] args) {
        Sub two = new Sub(4, "superText");
        System.out.println(two.toString());

        two.initFields("two");
        System.out.println(two.toString());

        two.initFields(2, "one");
        System.out.println(two.toString());
    }
}

class Superclass{
    private String superTxt;
    Superclass(){
        initTxt();
    }
    Superclass(String superTxt){
        this.superTxt = superTxt;
    }

    void initTxt(){
        superTxt = "default ";
    }
    void initTxt(String text){
        superTxt = text;
    }

    @Override
    public String toString(){
        return "Class: SuperClass, superTxt: " + superTxt;
    }
}

class Sub extends Superclass{
    int numero;
    Sub(int numero, String text){
        this.numero = numero;
        super.initTxt(text);
    }

    private void initNumeroDefault() {
        numero = -1;
    }
        void initFields(){
            initNumeroDefault();
            super.initTxt();
        }

        void initFields(int numero) {
            this.numero = numero;
            super.initTxt();
        }

        void initFields(String text){
        initNumeroDefault();
        super.initTxt(text);
        }

        void initFields(int numero, String text){
        this.numero = numero;
        super.initTxt(text);
        }

        @Override
        public String toString(){
        return super.toString() + "Class: " + this.getClass().getName() + ", numero: " + numero;
        }
}
