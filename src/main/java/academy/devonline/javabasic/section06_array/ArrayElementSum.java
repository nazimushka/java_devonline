package academy.devonline.javabasic.section06_array;

public class ArrayElementSum {
    public static void main(String[] args) {

        int[] source = {1,2,3,4,6};

        int sum = 0;

        for (int i = 0; i < source.length; i++) {
            sum += source[i];
        }

        System.out.println(sum);
    }
}
