package academy.devonline.javabasic.section07_String;

public class ReverseStringBuilder2 {
    public static void main(String[] args) {
        // read source data
        String s = "Hello world!";

        // processing
        //САМЫЙ ЭФФЕКТИВНЫЙ ЭТОТ ВАРИАНТ ЗА СЧЕТ ЕГО ВНУТРЕННЕЙ ЭФФЕКТИВНОСТИ. ЖРЕТ МЕНЬШЕ ПРОЦЕССОРА
        StringBuilder builder = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        //Второй способ
        //for (int i = 0; i < s.length(); i++) {
        //            builder.insert(0, s.chartAt(i);
        //        }

        //Третий способ
        //builder.append(s).reverse()

        // display result
        System.out.println(builder.toString());

    }
}
