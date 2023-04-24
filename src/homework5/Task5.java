package homework5;


import java.util.Arrays;

public class Task5 {
    /**
     * Дан массив целых чисел. Числа в массиве расположены в произвольном порядке (массив не отсортирован).
     * Необходимо выбрать опорный элемент (любым способом - первый элемент или элемент, расположенный посередине массива).
     * Необходимо преобразовать массив таким образом, чтобы элементы, меньшие опорного оказались в массиве левее опорного, а большие - правее.
     * Замечание: после работы алгоритма, вы должны знать,
     * где располагается опорный элемент (ведь в результате работы алгоритма он возможно переместится со своего первоначального расположения).
     */
//решение сделано не без помощи интернета)


    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // выбор опорного элемента (пeрвый)
            int pivot = arr[low];
            int i = low + 1, j = high;
            while (i <= j) {
                while (i <= j && arr[i] < pivot)
                    i++;
                while (i <= j && arr[j] > pivot)
                    j--;
                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
            // перемещение опорного элемента на правильное место
            int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
            // рекурсивная сортировка двух подмассивов
            quickSort(arr, low, j - 1);
            quickSort(arr, j + 1, high);
        }
    }


}
