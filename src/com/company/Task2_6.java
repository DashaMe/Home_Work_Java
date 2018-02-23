package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_6 {
    //     6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 5 numbers");
        String[] arrayInputs = new String[5];

        for (int i = 0; i < arrayInputs.length; i++) {
            arrayInputs[i] = String.valueOf(input.nextInt());
        }

        for (int i = 0; i < arrayInputs.length; i++) {
            char[] charArray = arrayInputs[i].toCharArray();

            if (arrayInputs[i].equals(String.valueOf(bubbleSort(charArray)))) {
                System.out.println("First number with ordered digits is " + arrayInputs[i]);
                break;
            }
        }
    }

    private static char[] bubbleSort(char[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int d = 0; d < i; d++) {
                if (array[d] > array[d + 1]) {
                    char temp = array[d];
                    array[d] = array[d + 1];
                    array[d + 1] = temp;
                }
            }
        }
        return array;
    }
}



