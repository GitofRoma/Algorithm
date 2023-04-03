package homeWork3;

import lessons.package1.Stack;

public class Task2 {
//    Task 2. 1. Даны два целых числа x и n, напишите функцию для вычисления x^n
//    решение 1 - рекурсивно O(n)
//    решение 2 - улучшить решение 1 до O(log n)
//    Task 3. 4 Найдите пиковый элемент в двумерном массиве
//    Элемент является пиковым, если он больше или равен своим четырем соседям слева, справа, сверху и снизу. Например, соседями для A[i][j] являются A[i-1][j], A[i+1][j], A[i][j-1] и A[i][j+1]. Для угловых элементов отсутствующие соседи считаются отрицательными бесконечными значениями.
//        10 20 15
//        21 30 14
//        7  16 32
//    Выход: 30 — пиковый элемент, потому что все его  соседи меньше или равны ему. 32 также можно выбрать в качестве пика.

    public static void main(String[] args) {
        hanoiIter(4);
        System.out.println(power(3, 3));
        int[][] array = {
                {10, 20, 15,40},
                {21, 30, 14,31},
                {7,  16, 32, 5},
                {2,  18, 32, 40}
        };
        System.out.println(findElement(array));
    }

    private static void hanoiIter(int n) {
        Stack first = new Stack("1");
        Stack second = new Stack("2");
        Stack third = new Stack("3");

        for (int i = n; i >= 1; i--) {
            first.push(i);
        }
        while (true) {          //1-2, 1-3, 2-3
            // 1 - 2
            swap(first, second);
            if (first.isEmpty() && second.isEmpty()) {
                break;
            }
            // 1 - 3
            swap(first, third);
            if (first.isEmpty() && second.isEmpty()) {
                break;
            }
            // 2 - 3
            swap(second, third);
            if (first.isEmpty() && second.isEmpty()) {
                break;
            }
        }
    }

    // Перекладывание из а в b
    private static void swap(Stack a, Stack b) {
        if (a.isEmpty()) {
            System.out.println(b.getName() + "->" + a.getName());
            a.push(b.pop());
        } else if (b.isEmpty()) {
            System.out.println(a.getName() + "->" + b.getName());
            b.push(a.pop());
        } else {
            if (a.peek() > b.peek()) {
                System.out.println(b.getName() + "->" + a.getName());
                a.push(b.pop());
            } else {
                System.out.println(a.getName() + "->" + b.getName());
                b.push(a.pop());
            }
        }
    }


    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else {
            return x * power(x, n - 1);
        }
    }

    public static int findElement(int[][] arr) {
        int result = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                if (arr[i][j] >= arr[i - 1][j] && arr[i][j] >= arr[i + 1][j] && arr[i][j] >= arr[i][j - 1] && arr[i][j] >= arr[i][j + 1]) {
                    result = arr[i][j];
                }
            }
        }
        return result;
    }

}
