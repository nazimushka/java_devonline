package academy.devonline.javabasic.section08_functions;

public class SumFunctionWithVarArgs {
    public static void main(String[] args) {
        System.out.println(SumOf());
        System.out.println(SumOf(1, 2));
        System.out.println(SumOf(1, 2, 3, 4, 5));
    }

    private static int SumOf(int... args) {
        var sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
