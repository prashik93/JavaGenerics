package com.java_generics;

import com.sun.tools.javac.Main;

public class MaximumVariable<T extends Comparable<T>> {
     T firstElement;
     T secondElement;
     T thirdElement;
     T fourthElement;

    public MaximumVariable( T firstElement, T secondElement, T thirdElement, T fourthElement) {
    this.firstElement = firstElement;
    this.secondElement = secondElement;
    this.thirdElement = thirdElement;
    this.fourthElement = fourthElement;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Java Generics!");

        Integer a = 50;
        Integer b = 60;
        Integer c = 70;
        Integer d = 80;

        Float p = 7.4f;
        Float q = 8.3f;
        Float r = 9.2f;
        Float s = 9.8f;

        String w = "Apple";
        String x = "Banana";
        String y = "Guava";
        String z = "Peach";

        new MaximumVariable<>(a, b, c, d).testMaximum(a, b, c, d);
        new MaximumVariable<>(p, q, r, s).testMaximum(p, q, r, s);
        new MaximumVariable<>(w, x, y, z).testMaximum(w, x, y, z);
    }

    public <T extends Comparable<T>> void testMaximum(T firstElement, T secondElement, T thirdElement, T fourthElement) {
        T maximum = firstElement;
        if(secondElement.compareTo(maximum) > 0) {
            maximum = secondElement;
        }
        if(thirdElement.compareTo(maximum) > 0) {
            maximum = thirdElement;
        }
        if(fourthElement.compareTo(maximum) > 0) {
            maximum = fourthElement;
        }
        printMax( firstElement, secondElement, thirdElement, fourthElement, maximum);
    }



    public <T> void printMax(T a, T b, T c, T d, T maximum) {
        System.out.printf("\nMaximum Among Three Elements i.e (%s, %s, %s, %s) is %s. ",a, b, c, d, maximum);
    }
}