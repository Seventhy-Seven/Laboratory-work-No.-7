package com.company;

public class Main {

    public static void main(String[] args) {

        First first = new First('Z');
        System.out.println(first);

        Second second = new Second('X', "text for second");
        System.out.println(second);

        Third third = new Third('Q',"text for third", 9);
        System.out.println(third);
    }
}
