package academy.devonline.javabasic.section07_String;

public class StringBuilderUsage {
    public static void main(String[] args) {
        String s = "hello";

        //Изменяемые строки делаются через StringBuilder

        StringBuilder builder = new StringBuilder();
        builder.append("world");
        builder.insert(0, "hello");
        builder.insert(5, ' ');

        String result = builder.toString();
        System.out.println(result);

        builder.deleteCharAt(0); // так удаляется символ
        System.out.println(builder.toString());

        builder.setLength(0); // удалили все. обнулили
        //builder.delete(0, builder.length()); // удалили все. обнулили

        System.out.println(builder.toString());

        System.out.println("qwerty");

        System.out.println(s);
    }
}
