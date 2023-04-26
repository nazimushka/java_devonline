package academy.devonline.javabasic.section08_functions;

public class SumLibrary2 {

    public static int sumOf(short a, short b) {
        return (short) (a + b);
    }

    public static int sumOf(int a, int b) {
        return a + b;
    }

    public static long sumOf(long a, long b) {
        return a + b;
    }

    public static float sumOf(float a, float b) {
        return a + b;
    }

    public static double sumOf(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sumOf((short) 1, (short) 2));
        System.out.println(sumOf(1, 2));
        System.out.println(sumOf(1L, 2L));
        System.out.println(sumOf(1.f, 2.f));
        System.out.println(sumOf(1., 2.));
    }

}
