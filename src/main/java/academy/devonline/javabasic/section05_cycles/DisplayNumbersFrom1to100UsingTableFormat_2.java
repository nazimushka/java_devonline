package academy.devonline.javabasic.section05_cycles;

public class DisplayNumbersFrom1to100UsingTableFormat_2 {
    public static void main(String[] args) {
        // read source data
        int from = 1;
        int to = 100;
        int cols = 10;

        // display results
        for (int i = from; i <= to; i++) {
            System.out.print(i + "\t"); // \t - символ табуляции для ровной таблицы
            if (i% cols == 0){
                System.out.println();
            }
        }
    }
}

