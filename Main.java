package com.company;

public class Main {

    public static void main(String[] args) {
	First first = new First(3);
	System.out.println(first);

	Second second = new Second(5,'D');
	System.out.println(second);

	Third third = new Third(7, 'Q', "text");
	System.out.println(third);
    }
}
