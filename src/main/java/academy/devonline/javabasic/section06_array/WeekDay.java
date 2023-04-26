package academy.devonline.javabasic.section06_array;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        //read source data
        var day = new Scanner(System.in).nextInt();;

        //processing
        String[] days = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};

        var result = day >= 1 && day <=7 ? days[day-1] :
                "Invalid day: " + day;

        // display result
        System.out.println(result);
    }
}
