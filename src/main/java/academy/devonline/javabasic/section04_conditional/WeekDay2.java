package academy.devonline.javabasic.section04_conditional;

public class WeekDay2 {
    public static void main(String[] args) {
        //read source data
        var day = 7;
        //processing
        String result;
        if (day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result = "Tuesday";
        } else if (day == 3) {
            result = "Wednasday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Sutarday";
        } else if (day == 7) {
            result = "Sunday";
        } else {
            result = "Invalid day: " + day;
        }

        // display result
        System.out.println(result);

    }
}
