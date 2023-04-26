package academy.devonline.javabasic.section08_functions;

public class VarArgsExample {
    public static void main(String[] args) {
        System.out.println(concat());
        System.out.println(concat("Hello"));
        System.out.println(concat("Hello", "World"));
        System.out.println(concat("Hello", " ", "world", "!"));
    }
    //public static String concat(String[] args)
    public static String concat(String... args) {
        StringBuilder builder = new StringBuilder();
        for (String arg : args) {
            builder.append(arg);
        }
        return builder.toString();
    }
}
