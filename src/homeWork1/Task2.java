package homeWork1;

public class Task2 {
    //    Find the element that appears once in a sorted array
    //    Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        System.out.println(findElement(arr));

    }

    public static int findElement(int[] arrey) {

        for (int i = 1; i < arrey.length; i++) {
            if (arrey[i] != arrey[i - 1] && arrey[i] != arrey[i + 1]) {
                return arrey[i];
            }
        }

        return 505;
    }

}
