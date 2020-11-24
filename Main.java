package com.company;

public class Main {

    public static void main(String[] args) {

        First first = new First("text for first");
        first.print();

        Second second = new Second("text for second", 3);
        second.print();

        Third third = new Third("text for third", 'W');
        third.print();

        System.out.println();


        First through1 = new Second("abc", 5);
        through1.print();

        First through2 = new Third("qwe", 'A');
        through2.print();

    }
}
