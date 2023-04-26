package academy.devonline.javabasic.section04_conditional;

public class WeekDayWithTernaryOperatorBadExample {
    public static void main(String[] args) {
        {
            var day = 5;
            System.out.println(
                    day == 1 ? "Monday" :
                            day == 2 ? "Tuesday" :
                                    day == 3 ? "Wednasday" :
                                            day == 4 ? "Thursday" :
                                                    day == 5 ? "Friday" :
                                                            day == 6 ? "Sutarday" :
                                                                    day == 7 ? "Sunday" :
                                                                            "Invalid Day: " + day);
        }
        {
            //UniversalWeekDay
            var day = 7;
            var isMondayFirst = true;

            System.out.println(
                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 1 ? "Monday":
                            (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 2 ? "Tuesday":
                                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 3 ? "Wednasday":
                                            (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 4 ? "Thursday":
                                                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 5 ? "Friday":
                                                            (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 6 ? "Sutarday":
                                                                    (isMondayFirst ? day : day == 1 ? 7 : day - 1) == 7 ? "Sunday":
                                                                            "Invalid Day: " + day);
        }

    }
}
