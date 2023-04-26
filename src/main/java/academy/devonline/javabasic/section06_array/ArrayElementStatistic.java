package academy.devonline.javabasic.section06_array;

public class ArrayElementStatistic {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4, 3, 2,}; // 7 - размер.
        var count = 0;
        int[] copyArray= new int[array.length];
        System.arraycopy(array, 0, copyArray, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            for (int ca = 0; ca < copyArray.length; ca++) {
                System.out.print(array[i] + " arrray ");
                System.out.print(copyArray[ca] + " copyArray ");
                System.out.println();
            }
            System.out.println();
        }
    }
}

// (1/12)*100 = 8.3333
//(count/array.length)*100