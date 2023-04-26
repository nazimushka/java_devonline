package academy.devonline.javabasic.section07_String;

public class StringEquals {
    public static void main(String[] args) {
        //read source data
        String s1 = "hello";
        String s2 = "h"+s1.substring(1);

        System.out.println(s1);
        System.out.println(s2);

        // нужно при символьном сравнении equals
        if (s1.equals(s2)){
            System.out.println("s1=s2");
        }

    }
}
