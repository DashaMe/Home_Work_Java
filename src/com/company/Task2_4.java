package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2_4 {
    //     4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input 5 numbers");
        String[] arrayInputs = new String[5];
        //создаю переменную, где буду хранить минимальное количество уникальных цифр в числе
        //его значение равно 10, т.к. у нас всего 10 цифр от 0 до 9
        int minCountDifferentDigits = 10;

        for (int i = 0; i < 5; i++) {
            // заполняю массив вводом
            arrayInputs[i] = String.valueOf(input.nextInt());

            // HashSet - подобие листа, но его фишка в том, что он хранит только уникальные компоненты(нагуглила), например, из числа 1112 он создаст сет {1, 2} и все
            Set<Character> set = new HashSet<Character>();
            //добавляем "частички" нашего числа посимвольно в set
            for (int p = 0; p < arrayInputs[i].length(); p++) {
                set.add(arrayInputs[i].charAt(p));
            }
            // set.size() дает нам по сути число уникальных цифр в числе
            // пройдя циклом мы найдем минимальное количество уникальных цифр в числе, среди всех введенных чисел
            if (set.size() < minCountDifferentDigits) {
                minCountDifferentDigits = set.size();
            }
        }

        //снова идем циклом по элементам и с помощью HashSet "меряем" количество уникальных цифер, но теперь у нас есть минимальное значение с которым надо сравнивать (вычисленное выше)
        for (int i = 0; i < 5; i++) {
            Set<Character> set = new HashSet<Character>();
            for (int p = 0; p < arrayInputs[i].length(); p++) {
                set.add(arrayInputs[i].charAt(p));
            }
            //как только нашлось первое число с минимальным числом разных цифр, выводим его и делаем break; тем самым выполняя условие задания "найти первое из них"
            if (set.size() == minCountDifferentDigits) {
                System.out.println("First number with the least amount of different digits is: " + arrayInputs[i]);
                break;
            }
        }
    }
}
