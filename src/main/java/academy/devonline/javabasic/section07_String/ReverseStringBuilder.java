package academy.devonline.javabasic.section07_String;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String s = "Hello world!";

        StringBuilder builder = new StringBuilder();
        builder.append("Hello world!");
        builder.reverse();

        System.out.println(builder);

    }
}
