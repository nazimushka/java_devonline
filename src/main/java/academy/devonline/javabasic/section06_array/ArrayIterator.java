package academy.devonline.javabasic.section06_array;

public class ArrayIterator {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};

        // шаблон для прохождения о массиву  от начала до конца array.fori
        // выделяет красным, поскольку предлагает заменить на
        // foreach (alt + shift + enter
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        // шаблон для прохождения о массиву  от конца до начала array.forr (reverse)
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        // третий вариант прохождения по массиву array.for еще называют foreach
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
