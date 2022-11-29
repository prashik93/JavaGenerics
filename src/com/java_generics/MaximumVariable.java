package com.java_generics;

public class MaximumVariable {

    public static void main(String[] args) {
        System.out.println("Welcome to Java Generics!");
        Integer a = 50;
        Integer b = 60;
        Integer c = 70;

        Float p = 7.4f;
        Float q = 8.3f;
        Float r = 9.2f;

        String x = "Apple";
        String y = "Banana";
        String z = "Peach";

        checkAmongThreeElements(a, b, c);
        checkAmongThreeElements(p, q, r);
        checkAmongThreeElements(x, y, z);
    }

    public static <T extends Comparable> void checkAmongThreeElements(T a, T b, T c) {
        T maximum = a;
        if(b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if(c.compareTo(maximum) > 0) {
            maximum = c;
        }
        System.out.printf("\nMaximum Among Three Elements i.e (%s, %s, %s) is %s. ",a, b, c, maximum);
    }
}