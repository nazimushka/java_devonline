package academy.devonline.javabasic.section05_cycles;

public class DisplayNumbersFrom1to100UsingTableFormat_WhileVersion {
    public static void main(String[] args) {
        //read source data
        int i = 0;
        int to = 100;
        int cols = 10;

        // display results
        while (i < to) {
            System.out.print(++i+"\t"); // \t - символ табуляции для ровной таблицы
            if (i % cols == 0) {
                System.out.println();
            }
        }
    }
}

