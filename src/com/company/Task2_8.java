package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task2_8 {
    //        8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(99) + 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        int count = 0;
        int[][] matrix = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int s = 0; s < 4; s++) {
                matrix[i][s] = arr[count++];
                if (count == arr.length) {
                    break;
                }
            }
            if (count == arr.length) {
                break;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}


