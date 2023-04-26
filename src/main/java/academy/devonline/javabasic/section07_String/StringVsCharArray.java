package academy.devonline.javabasic.section07_String;

public class StringVsCharArray {
    public static void main(String[] args) {
        char [] s1 = {'h','e','l','l','o'};
        s1[0]='Q';
        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i]);
        }
        System.out.println();
        //______________________________________
        String s2 = "hello";
        for (int i = 0; i < s2.length(); i++) {
            System.out.print(s2.charAt(i));
        }
    }
}

// одно из главноых отличий в том, что в STRING изменить строчку невозможно,
// лишь явным образом

// второе главное отличие в том, что с массивом доступно 2 операции получить
// длинну массива и полуить элемент по индексу, а в строках кучу методов. можно ознакомится
