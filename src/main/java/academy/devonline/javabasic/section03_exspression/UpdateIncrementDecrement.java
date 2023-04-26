package academy.devonline.javabasic.section03_exspression;

public class UpdateIncrementDecrement {
    public static void main(String[] args) {
        var a = 0;
        System.out.println(a);
        a=5;
        System.out.println(a);
        a=a+1;
        System.out.println(a);

        a++;//a+=1 - инкремент
        System.out.println(a);

        a--;//a-=1 - декремент
        System.out.println(a);

        a*=3;
        System.out.println(a);

        a/=3;
        System.out.println(a);
    }
}
