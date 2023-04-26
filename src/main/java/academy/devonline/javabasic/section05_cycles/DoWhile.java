package academy.devonline.javabasic.section05_cycles;

public class DoWhile {
    public static void main(String[] args) {
        {
            var i = 100;
            while (i >= 1) {
                System.out.print(i-- + " ");
            }
            System.out.println();
        }

        {
            var i = 100;
            do {
                System.out.print(i-- + " ");
            } while (i >= 1);
            System.out.println();
        }

        // Important -------------------------------------------

        int n = 2; // при n=-1 выполнится лишь один раз do while
        // for
        for (int i = 0; i < n; i++) {
            System.out.println("for -> " + i);
        }
        // while
        {
            int i = 0;
            while (i < n) {
                System.out.println("while -> " + i++);
            }
        }
        // do while
        {
            int i = 0;
            do {
                System.out.println("do while -> " + i++);
            } while (i < n);
        }
    }
}