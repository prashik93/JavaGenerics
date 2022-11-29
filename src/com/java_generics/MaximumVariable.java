package com.java_generics;

public class MaximumVariable {

    public static void main(String[] args) {
        System.out.println("Welcome to Java Generics!");
        Integer a = 50;
        Integer b = 60;
        Integer c = 70;

        Integer maximumInteger = checkMaxAmongThreeNumber(a, b, c);
        System.out.println("Maximum among 3 Integers Numbers (" + a + ", " + b + ", " + c + ") " + "is : " + maximumInteger);
    }

    public static Integer checkMaxAmongThreeNumber(Integer a, Integer b, Integer c) {
        Integer maximum = a;
        if(b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if(c.compareTo(maximum) > 0) {
            maximum = c;
        }
        return maximum;
    }
}