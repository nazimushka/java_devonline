package academy.devonline.javabasic.section07_String;

import java.util.Arrays;

public class StringNewStringMethods {
    public static void main(String[] args) {
        String s = " Hello world! ";

        System.out.println("s.toUpperCase() = " + s.toUpperCase());// Верхний регистр
        System.out.println("s.toLowerCase() = " + s.toLowerCase());// Нижний регист

        System.out.println("s.repeat(2 = " + s.repeat(2)); //Печатает дважды или сколько захотим
        System.out.println("s.replace('l', 'j') = " + s.replace('l', 'j')); // меняет один символ на другой
        System.out.println("s.replace(\"Hello\", \"Bye\") = " + s.replace("Hello", "Bye")); // меняет одно слов на другое

        // позволяет из текущей строки вырезать подстроку начиная с какого-то индекса и до конца строки
        // либо же начиная с какого-то индекса и до второго индекса
        System.out.println("s.substring(6) = " + s.substring(6));
        System.out.println("s.substring(0,6) = " + s.substring(0,6));

        // Разделяет нашу строку по какому-то условию
        System.out.println(Arrays.toString(s.split(" ")));

        //обрезают начальные и конечные проблемы в текущей строке
        System.out.println(s.trim()); // этот метод почвился раньше
        System.out.println(s.strip()); // этот появился позже.сечас используют его

    }
}
