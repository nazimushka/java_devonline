package academy.devonline.javabasic.section04_conditional;

public class DisplayMaxNumber {
    public static void main(String[] args) {
        //read source data
        var a = 4;
        var b = 5;

        //processing
        String result = a > b ? "a max = " + a : "b max = " + b;

        //display  result
        System.out.println(result);
        System.out.println("Max number: " + Math.max(a, b));


    }
}
