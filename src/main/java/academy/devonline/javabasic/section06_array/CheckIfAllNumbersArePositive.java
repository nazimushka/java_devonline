package academy.devonline.javabasic.section06_array;

public class CheckIfAllNumbersArePositive {
    public static void main(String[] args) {
        // read source data
        int[] arrays = {1, 2, 0, 44, 5, 6};

        // processing
        boolean result = true;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < 0) {
                result=false;
            }
        }
        // display result
        System.out.println(result ? "All positive" : "Not all positive");
    }
}
