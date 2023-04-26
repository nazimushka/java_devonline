package academy.devonline.javabasic.section03_exspression;

public class RelationExpression {
    public static void main(String[] args) {
        var a = 2;
        var b = 5;

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);

        System.out.println(a>=8);
        System.out.println(a==9);
        var c1 = a==b;
        boolean c2 = a==b;
        System.out.println(c1);
        System.out.println(c2);
    }
}
