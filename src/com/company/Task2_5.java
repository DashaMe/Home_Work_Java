package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2_5 {
    //    5. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input 5 numbers");
        String[] arrayInputs = new String[5];

        for (int i = 0; i < 5; i++) {
            arrayInputs[i] = String.valueOf(input.nextInt());
        }

        numbersWithEvenDigits(arrayInputs);
        numbersWithOddDigits(arrayInputs);
        numbersWithMixedDigits(arrayInputs);
        numbersWithEqualAmountEvenAndOddDigits(arrayInputs);

    }

    private static void numbersWithEvenDigits(String[] array) {
        System.out.println("\nNumbers that contain only even digits:");
        for (String anArray : array) {
            int amountEven = 0;
            char[] charArr = anArray.toCharArray();
            for (char aCharArr : charArr) {
                if (aCharArr % 2 == 0) {
                    amountEven++;
                }
            }
            if (anArray.toCharArray().length == amountEven) {
                System.out.println(anArray);
            }
        }
    }

    private static void numbersWithOddDigits(String[] array) {
        System.out.println("\nNumbers that contain only odd digits:");
        for (String anArray : array) {
            int amountOdd = 0;
            char[] charArr = anArray.toCharArray();
            for (char aCharArr : charArr) {
                if (aCharArr % 2 != 0) {
                    amountOdd++;
                }
            }
            if (anArray.toCharArray().length == amountOdd) {
                System.out.println(anArray);
            }
        }
    }

    private static void numbersWithMixedDigits(String[] array) {
        System.out.println("\nNumbers that contain odd and even digits:");
        for (String anArray : array) {
            int amountEven = 0;
            int amountOdd = 0;
            char[] charArr = anArray.toCharArray();
            for (char aCharArr : charArr) {
                if (aCharArr % 2 == 0) {
                    amountEven++;
                } else amountOdd++;
            }
            if (amountEven > 0 & amountOdd > 0) {
                System.out.println(anArray);
            }
        }
    }

    private static void numbersWithEqualAmountEvenAndOddDigits(String[] array) {
        System.out.println("\nNumbers that contain equal amount of odd and even digits:");
        for (String anArray : array) {
            int amountEven = 0;
            int amountOdd = 0;
            char[] charArr = anArray.toCharArray();
            for (char aCharArr : charArr) {
                if (aCharArr % 2 == 0) {
                    amountEven++;
                } else amountOdd++;
            }
            if (amountOdd == amountEven) {
                System.out.println(anArray);
            }
        }
    }
}
