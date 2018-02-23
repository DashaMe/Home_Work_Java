package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2_7 {
    //        7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input 5 numbers");
        String[] arrayInputs = new String[5];

        for (int i = 0; i < 5; i++) {
            arrayInputs[i] = String.valueOf(input.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            Set<Character> set = new HashSet<Character>();
            for (int p = 0; p < arrayInputs[i].length(); p++) {
                set.add(arrayInputs[i].charAt(p));
            }
            if (arrayInputs[i].toCharArray().length == set.size()) {
                System.out.println("First number that consists of different digits only is: " + arrayInputs[i]);
                break;
            }
        }
    }
}
