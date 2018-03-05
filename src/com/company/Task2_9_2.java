package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.Task2_9_1.getMultidimensionalIntArray;

public class Task2_9_2 {
    //            9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
    public static void main(String[] args) {
        int[][] matrix292 = getMultidimensionalIntArray();
        printCoolArray(matrix292);

        System.out.println("Please, enter the number of points you want to shift array for");
        Scanner usersInput = new Scanner(System.in);
        int potentialArrayShift = usersInput.nextInt();
        int arrayShiftVertical = potentialArrayShift % matrix292.length;
        int arrayShiftHorizontal = potentialArrayShift % matrix292[0].length;

        System.out.println("Please, choose shift's direction ('up', 'down', 'right' or 'left')");
        String shiftDirection = usersInput.next();
        if (shiftDirection.equals("down")) {
            matrix292 = downShift(matrix292, arrayShiftVertical);
            printCoolArray(matrix292);
        }
        else if (shiftDirection.equals("up")) {
            matrix292 = upShift(matrix292, arrayShiftVertical);
            printCoolArray(matrix292);
        }
        else if (shiftDirection.equals("right")) {
            matrix292 = rightShift(matrix292, arrayShiftHorizontal);
            printCoolArray(matrix292);
        }
        else if (shiftDirection.equals("left")) {
            matrix292 = leftShift(matrix292, arrayShiftHorizontal);
            printCoolArray(matrix292);
        }
    }

    private static void printCoolArray(int[][] matrix292) {
        for (int[] ints : matrix292) {
            System.out.println(Arrays.toString(ints));
        }
    }

    private static int[][] downShift(int[][] array, int arrayShiftVertical) {
        int[][] shiftedArray = new int[array.length][array[0].length];
        for (int i = 0; i < array[0].length; i++) {
            for (int x = 0; x < array.length; x++) {
                if (x < (array.length - arrayShiftVertical)) {
                    shiftedArray[x + arrayShiftVertical][i] = array[x][i];
                } else {
                    shiftedArray[x + arrayShiftVertical - array.length][i] = array[x][i];
                }
            }
        }
        return shiftedArray;
    }

    private static int[][] upShift(int[][] array, int arrayShiftVertical) {
        int[][] shiftedArray = new int[array.length][array[0].length];
        for (int i = 0; i < array[0].length; i++) {
            for (int x = 0; x < array.length; x++) {
                if (x >= arrayShiftVertical) {
                    shiftedArray[x - arrayShiftVertical][i] = array[x][i];
                } else {
                    shiftedArray[x - arrayShiftVertical + array.length][i] = array[x][i];
                }
            }
        }
        return shiftedArray;
    }

    private static int[][] rightShift(int[][] array, int arrayShiftHorizontal) {
        int[][] shiftedArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[0].length; x++) {
                if (x < (array[0].length - arrayShiftHorizontal)) {
                    shiftedArray[i][x + arrayShiftHorizontal] = array[i][x];
                } else {
                    shiftedArray[i][x + arrayShiftHorizontal - array[0].length] = array[i][x];
                }
            }
        }
        return shiftedArray;
    }

    private static int[][] leftShift(int[][] array, int arrayShiftHorizontal) {
        int[][] shiftedArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[0].length; x++) {
                if (x >= arrayShiftHorizontal) {
                    shiftedArray[i][x - arrayShiftHorizontal]= array[i][x];
                } else {
                    shiftedArray[i][x - arrayShiftHorizontal + array.length] = array[i][x];
                }
            }
        }
        return shiftedArray;
    }
}
