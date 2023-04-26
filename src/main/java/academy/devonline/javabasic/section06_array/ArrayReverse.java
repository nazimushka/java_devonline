package academy.devonline.javabasic.section06_array;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] source = {6, 40, 34, 21, 7};
        int[] demoSource = new int[source.length];
        //source.length==5(это я понял)


        for (int i = source.length-1; i >= 0; i--) {
            demoSource[source.length-i-1] = source[i];
            System.out.println(Arrays.toString(demoSource));
        }

        System.arraycopy(demoSource, 0, source, 0, demoSource.length);
        System.out.println();
        System.out.println(Arrays.toString(source));

    }
}
