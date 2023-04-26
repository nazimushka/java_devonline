package academy.devonline.javabasic.section06_array;

public class FindMinElement {
    public static void main(String[] args) {
        int [] array = {1, -2, 8, 0, 5};
        int minDigit = array[0];


        for (int i = 1; i < array.length; i++) {
            if (array[i]<=minDigit) {
                minDigit=array[i];
            }
        }

        System.out.println(minDigit);
    }
}
