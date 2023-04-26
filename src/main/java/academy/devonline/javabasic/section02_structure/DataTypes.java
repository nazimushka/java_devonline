package academy.devonline.javabasic.section02_structure;

public class DataTypes {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("int: " + Integer.MIN_VALUE + " < " + i +" < " + Integer.MAX_VALUE);
        double d = 0.1;
        System.out.println("double: " + Double.MIN_VALUE + " < " + d +" < " + Double.MAX_VALUE);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println("boolean: Логичскмй тип данных. Либо true, либо false");

        char ch = 'a';
        System.out.println("char: " + Character.MIN_VALUE + " < " + ch +"(" +(int)ch +") < " + Character.MAX_VALUE);

        String s = "hello world";
        System.out.println(s);
    }
}
