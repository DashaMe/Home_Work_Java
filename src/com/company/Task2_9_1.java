package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_9_1 {
    //        9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чи-сел.
//            9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
    public static void main(String[] args) {
        int[][] matrix = createMultidimentionalArray();
        System.out.println(Arrays.deepToString(matrix));

        //сортировка в столбцах
        verticalBubbleSortForMultidimensionalArray(matrix);
        System.out.println(Arrays.deepToString(matrix));

        //сортировка в строках
        for (int[] ints : matrix) {
            bubbleSort(ints);
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    private static int[][] createMultidimentionalArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input the size of the array");
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * ((2 * n) + 1)) - n;
            }
        }
        return matrix;
    }

    private static void verticalBubbleSortForMultidimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int s = array.length - 1; s > 0; s--) {
                for (int d = 0; d < s; d++) {
                    if (array[d][i] > array[d + 1][i]) {
                        int temp = array[d][i];
                        array[d][i] = array[d + 1][i];
                        array[d + 1][i] = temp;
                    }
                }
            }
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int d = 0; d < i; d++) {
                if (array[d] > array[d + 1]) {
                    int temp = array[d];
                    array[d] = array[d + 1];
                    array[d + 1] = temp;
                }
            }
        }
    }
}