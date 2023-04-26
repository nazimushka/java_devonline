package academy.devonline.javabasic.section05_cycles;

public class DisplayNumbersFrom1to100UsingTableFormat {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i==11 || i==21|| i==31|| i==41|| i==51|| i==61|| i==71|| i==81 || i==91){
                System.out.println();
            }
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}
