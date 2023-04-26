package academy.devonline.javabasic.section06_array;

import java.util.Arrays;

public class ArrayElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        System.out.println(Arrays.toString(array));

        // доступ к элементу массива по индексу
        System.out.println(array[0]);

        array[0]=45; // поменяем перый эллемент массива на 45
        System.out.println(array[0]);
        System.out.println();

        System.out.println(Arrays.toString(array));
        System.out.print(array[0] + " ");
        System.out.print(array[1] + " ");
        System.out.print(array[2] + " ");
        System.out.print(array[3] + " ");
        System.out.print(array[4] + " ");



    }
}
