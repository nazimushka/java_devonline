package academy.devonline.javabasic.section06_array;

public class ArrayElementStatistic2 {
    public static void main(String[] args) {
        //read source data
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        //processing
        int[] unique = new int[array.length];
        int[] counts = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            var elements = array[i];

            var exists = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == elements) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                var number = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (elements == array[j]) {
                        number++;
                    }
                }
                unique[count] = elements;
                counts[count] = number;
                count++;

            }
        }
        // display result
        for (int i = 0; i < count; i++) {
            System.out.println(unique[i]+" = "+((double)counts[i]*100/ array.length) + " % ");

        }
    }
}


// (1/12)*100 = 8.3333
//(count/array.length)*100