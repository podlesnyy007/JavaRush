/*
Чтобы выполнить эту задачу, тебе нужно:
Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив.
Найти минимальное число среди элементов массива и вывести в консоль.
Требования:
•	В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов и заполни числами с клавиатуры.
•	В методе main(String[]) выведи в консоль минимальное число среди элементов массива.
*/

package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = console.nextInt();
        }

        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min)
                min = array[i];
        }

        System.out.println(min);
    }
}
