package academy.devonline.javabasic.section05_cycles;

public class DisplayEvenNumbersFrom0To50_DoWhileVersion {
    public static void main(String[] args) {
        // read source data
        int i = 0;
        int step = 2;
        int to = 50;

        // display results
        do {
            System.out.print((i += step) + " ");
        } while (i < to);
    }
}
