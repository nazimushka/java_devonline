package academy.devonline.javabasic.section06_array;

import java.util.Arrays;

public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {
        // read source data
        int[] arrays = {1, -2, 3, 8, 5};
        System.out.println(Arrays.toString(arrays));
        System.out.println();

        int[] demo = new int[arrays.length];
        var min = arrays[0];
        var max = arrays[0];
        //processing
        System.arraycopy(arrays, 0, demo, 0, arrays.length);

        for (int i = 0; i < demo.length; i++) {
            if (demo[i]>=max){
              max=demo[i];
            } else if (demo[i]<=min){
                min=demo[i];
            }
        }

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i]==min){
                arrays[i]=max;
            } else if (arrays[i]==max){
                arrays[i]=min;
            }

        }
        // display result
        System.out.println(Arrays.toString(arrays));
    }
}
