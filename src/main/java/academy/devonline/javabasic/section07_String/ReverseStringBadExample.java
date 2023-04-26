package academy.devonline.javabasic.section07_String;

public class ReverseStringBadExample {
    public static void main(String[] args) {
        //read source data
        String s = "Hello world!";

        //processing
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }

        //display result
        System.out.println(res);
    }
}

//не эффективно если не StringBuilder


