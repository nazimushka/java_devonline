package academy.devonline.javabasic.section08_functions;

public class LocalVars {
    public static void main(String[] args) {
        int a = 2;
        function1();
        function2(a);
    }

    private static void function1() { // локальная перменная доступна только внутри функции
        int b = 2;
        System.out.println(b);
    }

    private static void function2(int a) {
    }
}
