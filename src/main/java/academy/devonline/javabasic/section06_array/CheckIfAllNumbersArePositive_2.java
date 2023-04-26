package academy.devonline.javabasic.section06_array;

public class CheckIfAllNumbersArePositive_2 {
    public static void main(String[] args) {
        //read source data
        int[] arrays = {1, 2, -3, 4, 5};

        // processing
        var allPositive = true;
        for (int value : arrays) {
            if (value<0){
                allPositive=false;
                break;
            }
        }
        // display result
        System.out.println(allPositive ? "All positive":"Not all positive");
    }
}
