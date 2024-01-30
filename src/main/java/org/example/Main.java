package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
    }
}
// Ответ на вопрос 4:
// В данной последовательности присутствует избыточная закрывающая квадратная скобка. Для того чтобы сделать последовательность правильной, нужно удалить одну из закрывающих квадратных скобок
// [((())()(()))]

