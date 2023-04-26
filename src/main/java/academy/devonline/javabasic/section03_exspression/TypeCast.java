package academy.devonline.javabasic.section03_exspression;

public class TypeCast {
    public static void main(String[] args) {
        // int, double, boolean, char, String
        // чтобы интовое значение преобразоват в строку, нужно применть ValueOf
        String is = String.valueOf(1);
        String ds = String.valueOf(1.1);
        String bs = String.valueOf(true);
        String cs = String.valueOf('a');

        System.out.println("Hello " + 1 + 1.1 + true + 'a');
        // 1 - это int и о автоматически преобразовывается в строку при выводе
        // Такое преобразоваие может происходить и сдругими литералами
        // Для проеобразование и конкатенации автоматически в строку
        // необхоимо, чтоб начиналось с строки в данном случае это "Hello

        // из строки в int
        int si = Integer.parseInt("12");
        // из строки в double
        double sd = Double.parseDouble("1.2");
        // из строки в boolean
        boolean sb = Boolean.parseBoolean("true");

        // для преобразования строки в символ требуется немного другая конструкция
        char ch1 = "a".charAt(0); // - > a
        char ch2 = "abc".charAt(1);// - > b

        char ch3=2; // 2 байта
        int i1=4; // 4 байта
        double d5=8; //8 байт

        d5=i1;
        d5=ch3;
        i1=ch3;

        i1 = (int)d5;
        ch3=(char)d5;
        ch3=(char)i1;

        boolean b = true; // boolean можно привести только к строковому типу данных


    }
}
