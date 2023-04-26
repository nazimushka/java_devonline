package academy.devonline.javabasic.section06_array;

public class LinearSearch {
    public static void main(String[] args) {
        // read source data
        int [] array = {0,1,2,3,4,5,6,7,8,9};
        var query = 6; // каков индекс элемента query в данном массиве

        // processing
        var index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==query){
                index=i;
                break;
            }
        }
        //display result
        System.out.println(index);
    }
}
