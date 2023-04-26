package academy.devonline.javabasic.section05_cycles;

public class SumFrom1To100_2_ForVersion {
    public static void main(String[] args) {
        // read source data
        int from = 1;
        int to = 100;

        //processing
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum+=i;
        }

        //display results
        System.out.println(sum);
    }
}
