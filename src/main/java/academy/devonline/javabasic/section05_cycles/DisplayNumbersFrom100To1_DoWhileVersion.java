package academy.devonline.javabasic.section05_cycles;

public class DisplayNumbersFrom100To1_DoWhileVersion {
    public static void main(String[] args) {
        int i = 100;

        do {
            System.out.print(i-- + " ");
        } while (i >= 1);
    }
}
