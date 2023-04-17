package homework4;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println(sum(123));
        //task 2
        printRevers(123);

    }

    /**
     * Вычислите сумму  цифр числа.
     * При решении этой задачи нельзя использовать строки, списки, массив, циклы
     *
     * @param n Дано натуральное число N.
     * @return сумму
     */
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sum(n / 10);
        }
    }

    /**
     * Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их пробелами или новыми строками.
     *
     * @param n вводимое число
     * @return
     */
    public static void printRevers(int n) {
        if (n > 0) {
            System.out.print(n % 10 + " ");
            printRevers(n / 10);
        }


    }

}


