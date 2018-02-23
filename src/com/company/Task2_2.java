package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task2_2 {
    //2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input 5 numbers");
        int[] arrayInputs = new int[5];
        for (int i = 0; i < 5; i++) {
            arrayInputs[i] = input.nextInt();
        }
        bubbleSort(arrayInputs);
        System.out.println(Arrays.toString(arrayInputs));
        reverseBubbleSort(arrayInputs);
        System.out.println(Arrays.toString(arrayInputs));
    }

    private static void bubbleSort(int[] arrayInputs) {
        for (int i = arrayInputs.length - 1; i >= 0; i--) {
            for (int d = 0; d < i; d++) {
                if (arrayInputs[d] > arrayInputs[d + 1]) {
                    int temp = arrayInputs[d];
                    arrayInputs[d] = arrayInputs[d + 1];
                    arrayInputs[d + 1] = temp;
                }
            }
        }
    }

    private static void reverseBubbleSort(int[] arrayInputs) {
        for (int i = arrayInputs.length - 1; i >= 0; i--) {
            for (int d = 0; d < i; d++) {
                if (arrayInputs[d] < arrayInputs[d + 1]) {
                    int temp = arrayInputs[d];
                    arrayInputs[d] = arrayInputs[d + 1];
                    arrayInputs[d + 1] = temp;
                }
            }
        }
    }
}
