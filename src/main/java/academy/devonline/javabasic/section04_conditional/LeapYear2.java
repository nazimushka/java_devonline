package academy.devonline.javabasic.section04_conditional;

//год, номер которого кратен 400, — високосный;
//остальные годы, номер которых кратен 4, — високосные;
//остальные годы, номер которых кратен 100, — невисокосные;
//остальные годы - невисокосные.
public class LeapYear2 {
    public static void main(String[] args) {
        var year = 2019;

        boolean isLeap;
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }
        System.out.println(isLeap ? year + " is leap year" :
                year + " is not leap year");

    }
}
