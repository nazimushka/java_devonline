package academy.devonline.javabasic.section03_exspression;

public class IntOverFlow {
    public static void main(String[] args) {
        {
            var i = Integer.MAX_VALUE;
            System.out.println(i);
            System.out.println((i+1));
        }
        {
            var i = Integer.MIN_VALUE;
            System.out.println(i);
            System.out.println((i-1));
        }
    }
}
