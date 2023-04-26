package academy.devonline.javabasic.section03_exspression;

public class LogicExpressions {
    public static void main(String[] args) {
        var a = true;
        var b = false;
        var c = 2>1;
        var d = 2==1;

        System.out.println(!a);// не "а" значит false - инверсия
        System.out.println(!b); // не "b" значит true - инверсия

        System.out.println(a&&b); // логическое "И", если один из них false - результат false
        System.out.println(a||b); // логическое "ИЛИ", если один из них true - резульат true
        //-----------------------------------------
        {
            System.out.println("--------------- && ---------------");
            System.out.println("true \t && \t true \t = \t" + (true && true));
            System.out.println("true \t && \t false \t = \t" + (true && false));
            System.out.println("false \t && \t true \t = \t" + (false && true));
            System.out.println("false \t && \t false \t = \t" + (false && false));
        }
        {
            System.out.println("--------------- || ---------------");
            System.out.println("true \t || \t true \t = \t" + (true || true));
            System.out.println("true \t || \t false \t = \t" + (true || false));
            System.out.println("false \t || \t true \t = \t" + (false || true));
            System.out.println("false \t || \t false \t = \t" + (false || false));
        }
    }
}
