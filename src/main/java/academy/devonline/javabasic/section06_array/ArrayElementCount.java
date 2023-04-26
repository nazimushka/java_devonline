package academy.devonline.javabasic.section06_array;

public class ArrayElementCount {
    public static void main(String[] args) {
        int [] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]==2){
                count++;
            }
        }
        System.out.println(count);
    }
}
