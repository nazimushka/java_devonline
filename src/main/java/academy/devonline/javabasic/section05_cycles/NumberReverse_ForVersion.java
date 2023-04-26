package academy.devonline.javabasic.section05_cycles;

public class NumberReverse_ForVersion {
    public static void main(String[] args) {
        int a = 123;

        for (int i = 0; a > 0; i++) {
            int last_digit=a%10;
            System.out.print(last_digit);
            a=a/10;
        }
    }
}
