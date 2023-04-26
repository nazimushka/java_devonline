package academy.devonline.javabasic.section07_String;

import academy.devonline.javabasic.section02_structure.In;

import java.math.BigInteger;
import java.util.Arrays;

public class BigIntegerSum {
    public static void main(String[] args) {
        // read source data
        var a = "123456789012345678901234567890123456789012345678901234567890";
        var b = "12345678901234567890123456789012345678901234567890";

        // processing
        if (a.length() >= b.length()) {
            b = "0".repeat(a.length() - b.length()) + b;
        } else if (b.length() >= a.length()) {
            a = "0".repeat(b.length() - a.length()) + a;
        }

        StringBuilder res = new StringBuilder();
        int temp = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            var digit1 = Integer.parseInt(String.valueOf(a.charAt(i))); // символ в строку. строку в целочисленное
            var digit2 = Integer.parseInt(String.valueOf(b.charAt(i))); // символ в строку. строку в целочисленное
            var sum = digit1 + digit2 + temp;

            if (sum > 9) {
                temp = 1;
                sum %= 10;
            } else {
                temp = 0;
            }
            res.insert(0, sum); // доавить в значение с индексом 0 стрингбилдера пказатели sum
        }
        if (temp != 0) {
            res.insert(0, temp); // проверка в конце. если темп неравен 0, то доавить в значение с индексом 0
        }

        // display result
        System.out.println(res.toString());
        System.out.println(new BigInteger(a).add(new BigInteger(b)));

    }

}
