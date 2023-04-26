package academy.devonline.javabasic.section08_functions;

public class FunctionOverLoading {
    public static void main(String[] args) {
        System.out.println(div(1, 2)); // div int int
        System.out.println(div(1., 2.)); // div double_double
    }

    public static int div(int a, int b) {return a / b;}

    public static double div(double a, double b) { return a / b;}

}


