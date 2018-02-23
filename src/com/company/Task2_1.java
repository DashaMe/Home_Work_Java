package com.company;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Task2_1 {
    // 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 5 numbers");
        String[] arrayInputs = new String[5];
        for (int i = 0; i < 5; i++) {
            arrayInputs[i] = String.valueOf(input.nextInt());
        }
        int maxLength = arrayInputs[1].length();
        int minLength = arrayInputs[1].length();
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < 5; i++) {
            if (arrayInputs[i].length() > maxLength) {
                maxLength = arrayInputs[i].length();
                maxIndex = i;
            }
            if (arrayInputs[i].length() < minLength) {
                minLength = arrayInputs[i].length();
                minIndex = i;
            }
        }
        System.out.println("The shortest number is: " + arrayInputs[minIndex] + " It's length is: " + minLength + " symbols.");
        System.out.println("The longest number is: " + arrayInputs[maxIndex] + " It's length is: " + maxLength + " symbols.");
    }
}
