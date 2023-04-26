package academy.devonline.javabasic.section03_exspression;

public class OpertorPrecedence {
    public static void main(String[] args) {
        var a = 4;
        var b = 2+-4*5 - a++ / 4 + --a;

        a = 4;
        var c = 2 +((-4)*5) - ((a++)/4) + (--a);

        System.out.println(b);
        System.out.println(c);

        System.out.println("hello" + 1 + 1); // конкатенация строк
        System.out.println(1 + 1+"hello");// левоассоциативная операция

        System.out.println("hello" + (1 + 1));


    }
}
