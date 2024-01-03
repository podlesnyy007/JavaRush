/*
В переменную hugeAmount нужно записать число 100500.
Используй переменные bigAmount, greatAmount и преобразование строки в число.
Для объявления и инициализации hugeAmount используй одну команду.
Требования:
•	Не изменяй значения переменных bigAmount и greatAmount.
•	Для инициализации переменной hugeAmount используй bigAmount, greatAmount и метод Integer.parseInt(String).
•	Программа должна выводить на экран переменную hugeAmount.
*/

package com.javarush.tasks.pro.tasks02.task10;

public class Solution 
{
    public static void main(String[] args) 
    {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount);

        System.out.println(hugeAmount);
    }
}
