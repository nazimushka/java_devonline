package academy.devonline.javabasic.section07_String;

public class FindMinString2 {
    public static void main(String[] args) {
        // read source data
        String[] array = {"one", "two", "three", "four", "five"};

        //processing
        String min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min.compareTo(array[i]) > 0) {
                min = array[i];
            }
        }

        // display result
        System.out.println(min);
    }
}
