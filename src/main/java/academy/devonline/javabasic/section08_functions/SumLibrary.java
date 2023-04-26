package academy.devonline.javabasic.section08_functions;

import java.util.Scanner;

public class SumLibrary {
    public static void main(String[] args) {
        System.out.println(sumOf(1, 2)); // short_short
        System.out.println(sumOf(1, 2)); // int_int
        System.out.println(sumOf(1, 2)); // long_long
        System.out.println(sumOf(1., 2.)); // float_float
        System.out.println(sumOf(1., 2.)); // double_double
    }

    public static short sumOf(short a, short b) {return (short)(a + b);}
    public static int sumOf(int a, int b) {return a + b;}
    public static long sumOf(long a, long b) {return a + b;}
    public static float sumOf(float a, float b) { return a + b;}
    public static double sumOf(double a, double b) { return a + b;}

}
