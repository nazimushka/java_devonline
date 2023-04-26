package academy.devonline.javabasic.section06_array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {


        int [] array = {1,2,4,5,8,11};
        int [] arrayCopy = new int[array.length];;


        for (int i = 0; i < array.length; i++) {
            arrayCopy[i]=array[i];
        }
        System.out.println(Arrays.toString(arrayCopy));
    }
}
