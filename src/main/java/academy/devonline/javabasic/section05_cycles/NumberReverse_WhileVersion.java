package academy.devonline.javabasic.section05_cycles;

/*
Исходное число:     123456789
Реверсивная версия: 987654321
-------------------------
Исходное число:     123
Реверсивная версия: 213
 */
public class NumberReverse_WhileVersion {
    public static void main(String[] args) {
        // read source data
        int a = 123456789;
        //processing and display results
        while (a > 0) {
            int last_digit=a%10;
            System.out.print(last_digit);
            a/= 10;
        }
    }
}
