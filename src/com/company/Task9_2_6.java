package com.company;

import java.util.Arrays;

import static com.company.Task2_9_1.getMultidimensionalIntArray;


public class Task9_2_6 {
    //            9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
    public static void main(String[] args) {
        int[][] matrix926 = getMultidimensionalIntArray();
        System.out.println(Arrays.deepToString(matrix926));

        for (int[] ints : matrix926) {
            int stringSum = 0;
            for (int i = 0; i < ints.length; i++) {
                stringSum = +ints[i];
            }
            int average = stringSum / ints.length;
            for (int i = 0; i < ints.length; i++) {
                ints[i] = ints[i]-average;
            }
        }
        System.out.println(Arrays.deepToString(matrix926));
    }

}

