package com.company;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_3 {

    // 3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input 5 numbers");
        String[] arrayInputs = new String[5];
        double length = 0;

        for (int i = 0; i < 5; i++) {
            arrayInputs[i] = String.valueOf(input.nextInt());
            length = length + arrayInputs[i].length();
        }
        double averageLength = length / 5;
        System.out.println("Average length of inputted numbers is: " + averageLength);

        System.out.println("\nNumbers with length less than average:");
        for (int i = 0; i < 5; i++) {
            if (arrayInputs[i].length() < averageLength) {
                System.out.println("Number " + arrayInputs[i] + " that has length " + arrayInputs[i].length());
            }
        }

        System.out.println("\nNumbers with length bigger than average:");
        for (int i = 0; i < 5; i++) {
            if (arrayInputs[i].length() > averageLength) {
                System.out.println("Number " + arrayInputs[i] + " that has length " + arrayInputs[i].length());
            }
        }

        System.out.println("\nNumbers with average length:");
        for (int i = 0; i < 5; i++) {
            if (arrayInputs[i].length() == averageLength) {
                System.out.println("Number " + arrayInputs[i] + " that has length " + arrayInputs[i].length());
            }
        }
    }

}
