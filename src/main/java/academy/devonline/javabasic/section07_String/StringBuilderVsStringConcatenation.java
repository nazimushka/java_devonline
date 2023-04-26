package academy.devonline.javabasic.section07_String;

public class StringBuilderVsStringConcatenation {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s3";

        String res = s1 + s2 + s3;

        String res2 = new StringBuilder().append(s1).append(s2).append(s3).toString();

        System.out.println(res);
        System.out.println(res2);
        // В данном случае более эффетивным явялется конкатенация строк, то есть СТРИНГ

    }
}
