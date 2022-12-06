package com.java_generics;

public class MaximumVariable<T extends Comparable<T>> {
     T firstElement;
     T secondElement;
     T thirdElement;

    public MaximumVariable( T firstElement, T secondElement, T thirdElement) {
    this.firstElement = firstElement;
    this.secondElement = secondElement;
    this.thirdElement = thirdElement;
    }

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


        testMaximum(a, b, c);
        testMaximum(p, q, r);
        testMaximum(x, y, z);
    }

    public static <T extends Comparable<T>> void testMaximum(T firstElement, T secondElement, T thirdElement) {
        T maximum = firstElement;
        if(secondElement.compareTo(maximum) > 0) {
            maximum = secondElement;
        }
        if(thirdElement.compareTo(maximum) > 0) {
            maximum = thirdElement;
        }
        printMax( firstElement, secondElement, thirdElement, maximum);
    }

    public static <T> void printMax(T a, T b, T c, T maximum) {
        System.out.printf("\nMaximum Among Three Elements i.e (%s, %s, %s) is %s. ",a, b, c, maximum);
    }
}