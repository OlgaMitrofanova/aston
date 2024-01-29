package org.example;

import java.util.Scanner;

public class Do {
    public static void main(String[] args) {
        // Создаем массив чисел
        int[] numbers = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

        // Выводим элементы массива, кратные 3
        System.out.println("Элементы массива, кратные 3:");
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}