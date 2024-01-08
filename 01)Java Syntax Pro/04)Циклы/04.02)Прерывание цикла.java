/*
Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.
Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.
Требования:
•	Программа должна вывести в консоль сумму всех чисел от 1 до 100 включительно, не кратных 3.
•	В программе необходимо использовать цикл while.
•	В программе необходимо использовать оператор continue.
*/

package com.javarush.task.pro.task04.task0407;

public class Solution {
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;
        while (number < 100) {
            number++;
            if (number % 3 == 0)
                continue;
            sum += number;
        }
        System.out.println(sum);
    }
}
