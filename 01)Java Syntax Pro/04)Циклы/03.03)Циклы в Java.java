/*
Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.
Требования:
•	Программа должна считывать данные c клавиатуры.
•	Необходимо посчитать сумму введенных целых чисел и вывести её на экран, если пользователь ввел стоп слово.
•	В программе необходимо использовать цикл while.
*/

package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int sum = 0;
        boolean isExit = false;

        while (!isExit) {
            if (console.hasNextInt()) {
                int number = console.nextInt();
                sum += number;
            }
            else if (console.nextLine().equals("ENTER")) {
                isExit = true;
            }
        }
        System.out.println(sum);
    }
}
