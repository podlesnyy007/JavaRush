/*
Используя цикл while вывести на экран сто раз цитату (переменная quote):
«Я никогда не буду работать за копейки. Амиго»
Каждое значение вывести с новой строки.
Требования:
•	Программа должна выводить текст на экран.
•	Программа должна выводить на экран 100 раз содержимое переменной quote.
•	В программе необходимо использовать цикл while.
*/

package com.javarush.task.pro.task04.task0401;

public class Solution {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        
        int n = 0;
        while (n < 100) {
            System.out.println(quote);
            n++;
        }
    }
}
