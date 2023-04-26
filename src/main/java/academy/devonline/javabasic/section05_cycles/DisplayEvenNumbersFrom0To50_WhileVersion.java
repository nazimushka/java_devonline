package academy.devonline.javabasic.section05_cycles;

public class DisplayEvenNumbersFrom0To50_WhileVersion {
    public static void main(String[] args) {
        int i = 0;
        while (i < 50) {
            System.out.print((i += 2) + " ");
        }
    }
}
