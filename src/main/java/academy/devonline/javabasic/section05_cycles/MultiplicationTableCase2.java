package academy.devonline.javabasic.section05_cycles;

public class MultiplicationTableCase2 {
    public static void main(String[] args) {
        //read source data
        var to = 9;

        //processing and display result
        for (int i = 2; i <= to; i++) {
            for (int j = 2; j <= to; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
