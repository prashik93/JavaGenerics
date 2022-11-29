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

        Integer maximumInteger = checkMaxAmongThreeIntegerNumber(a, b, c);
        Float maximumFloat = checkMaxAmongThreeFloatNumber(p, q, r);
        String maximumString = checkMaxAmongThreeStrings(x, y, z);
        System.out.println("Maximum among 3 Integers Numbers (" + a + ", " + b + ", " + c + ") " + "is : " + maximumInteger);
        System.out.println("Maximum among 3 Float Numbers (" + p + ", " + q + ", " + r + ") " + "is : " + maximumFloat);
        System.out.println("Maximum among 3 Strings (" + x + ", " + y + ", " + z + ") " + "is : " + maximumString);
    }

    public static Integer checkMaxAmongThreeIntegerNumber(Integer a, Integer b, Integer c) {
        Integer maximum = a;
        if(b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if(c.compareTo(maximum) > 0) {
            maximum = c;
        }
        return maximum;
    }

    public static Float checkMaxAmongThreeFloatNumber(Float p, Float q, Float r) {
        Float maximum = p;
        if(q.compareTo(maximum) > 0) {
            maximum = q;
        }
        if(r.compareTo(maximum) > 0) {
            maximum = r;
        }
        return maximum;
    }

    public static String checkMaxAmongThreeStrings(String x, String y, String z) {
        String maximum = x;
        if(y.compareTo(maximum) > 0) {
            maximum = y;
        }
        if(z.compareTo(maximum) > 0) {
            maximum = z;
        }
        return maximum;
    }
}