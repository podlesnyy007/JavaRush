/*
В методе main на экран выводятся три строки.
Внеси изменения в код, чтобы все буквы в этих строках стали заглавными.
Требования:
•	Не изменяй значения переменных caps и usa.
•	У трех строк, переданных в метод println, вызови метод toUpperCase.
•	Вывод программы должен содержать три строки.
*/

package com.javarush.task.pro.task02.task0212;

public class Solution 
{
    public static void main(String[] args) 
    {
        String caps = "if I type in caps ";
        String usa = "сша";

        System.out.println(usa.toUpperCase());
        System.out.println("Винни Пух".toUpperCase());
        System.out.println((caps + "they know I mean business").toUpperCase());
    }
}
