package academy.devonline.javabasic.section05_cycles;

public class InfiniteOrLongCycle {
    public static void main(String[] args) {
        long time = System.nanoTime();

        for (int i = 0; i < 100_000_000; i++) {
            System.currentTimeMillis();
            if (i % 1_000_000==0){ // доказательство, что она работает
                System.out.println(i);
            }
        }
        long result = System.nanoTime();
        System.out.println((double) result / 1_000_000_000 + " seconds");
    }
}
