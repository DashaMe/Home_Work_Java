package com.company;

import java.util.Arrays;

import static com.company.Task2_9_1.getMultidimensionalIntArray;


public class Task2_9_6 {
    //            9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
    public static void main(String[] args) {
        int[][] matrix296 = getMultidimensionalIntArray();
        System.out.println(Arrays.deepToString(matrix296));

        for (int[] ints : matrix296) {
            int stringSum = 0;
            for (int i = 0; i < ints.length; i++) {
                stringSum = +ints[i];
            }
            int average = stringSum / ints.length;
            for (int i = 0; i < ints.length; i++) {
                ints[i] = ints[i] - average;
            }
        }
        System.out.println(Arrays.deepToString(matrix296));
    }

}

