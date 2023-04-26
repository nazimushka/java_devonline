package academy.devonline.javabasic.section07_String;

public class StringVerificationMethods {
    public static void main(String[] args) {
        String s = "Hello world world";

        System.out.println(s.contains("world"));
        //проверяет есть ли в строке "world" - true or false
        System.out.println("s.contains(\"world\") = " + s.contains("world"));
        System.out.println("s.contains(\"World\") = " + s.contains("World"));

        //индекс вхождения символа или какой-то подстроки
        System.out.println("s.indexOf('o') = " + s.indexOf('o')); // если первое вхождение
        System.out.println("s.lastIndexOf('o') = " + s.lastIndexOf('o')); // если последнее

        // также проверяет вхождение целой строки или подстроки
        System.out.println("s.indexOf('world') = " + s.indexOf("world")); // индекс начала подстроки world в текущей строке
        System.out.println("s.lastIndexOf('world') = " + s.lastIndexOf("world")); // последнее вхождение строки

        //начинается ли текущая строка с какой подстароки
        System.out.println("s.startsWith(\"Hello\") = " + s.startsWith("Hello")); //начианется ли строка на Hello - true
        System.out.println("s.startsWith(\"Hello\") = " + s.endsWith("world")); //заканчивается ли на world - true

        // Является ли строка пустой или нет
        System.out.println("s.isEmpty() = " + s.isEmpty()); //строка не является пустой

        System.out.println("".isEmpty());
    }
}
