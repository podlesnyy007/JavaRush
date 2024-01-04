/*
Считай с клавиатуры три целых числа.
Выведи на экран их среднее арифметическое.
Пример ввода:
51
101
201
Пример вывода:
117
Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
Используй деление без остатка.
Требования:
•	Программа должна считывать с клавиатуры три целых числа.
•	Программа должна выводить на экран среднее арифметическое считанных чисел.
*/

package com.javarush.tasks.pro.tasks02.task15;

import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        
        System.out.println((a + b + c) / 3);
    }
}
