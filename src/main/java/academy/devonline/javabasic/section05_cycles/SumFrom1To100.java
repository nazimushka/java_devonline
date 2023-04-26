package academy.devonline.javabasic.section05_cycles;

public class SumFrom1To100 {
    public static void main(String[] args) {
        //read source data
        int i = 0;
        int count=0;

        //processing
        while (i<100) {
            i++;
            count+=i;
        }

        // display results
        System.out.print(count);
    }
}
