package com.company;

public class Main {

    public static void main(String[] args) {
        Sub first = new Sub("subclass ");
        System.out.println(first.toString());
        System.out.println();

        Sub first_2 = new Sub("super ", "subclass ");
        System.out.println(first_2.toString());
    }
}

class Two{
    private String twoText;

    Two(){

    }
    Two(String twoText){
        this.twoText = twoText;
    }

    @Override
    public String toString(){
        return "Class: Two, twoText " + twoText;
    }
}

class Sub extends Two{
    private final String ForTwo;

    Sub(String ForTwo){
        super();
        this.ForTwo = ForTwo;
    }

    Sub(String TwoText, String ForTwo){
        super(TwoText);
        this.ForTwo = ForTwo;
    }

    @Override
    public String toString(){
        return super.toString() + "Class " + this.getClass().getName() + ",ForTwo " + ForTwo;
    }

}

