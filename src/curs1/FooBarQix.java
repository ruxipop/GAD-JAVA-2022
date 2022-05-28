package curs1;

import java.util.Scanner;

public class FooBarQix {


    public FooBarQix() {
    }

    private String compute(int nb) {
        String result = null;
        if (nb % 3 == 0) result = "Foo";
        if (nb % 5 == 0) result = "Bar";
        if (nb % 7 == 0) result = "Qix";
        if (nb == 3) result += "Foo";
        if (nb == 5) result += "Bar";
        if (nb == 7) result += "Qix";
        return result;
    }

    private String compute2(int nb) {
        String result = null;
        if (nb == 0) result = "*";
        return result;
    }

    public static class Main {
        public static void main(String[] args) {
            FooBarQix fooBarQix = new curs1.FooBarQix();
            Scanner keyboard = new Scanner(System.in);
            while (true) {

                int myint = keyboard.nextInt();
                System.out.println("=>");
                String result = fooBarQix.compute(myint);

                if (result == null) {
                    System.out.println(myint);
                } else {
                    System.out.println(result);
                }
            }
        }
    }
}
