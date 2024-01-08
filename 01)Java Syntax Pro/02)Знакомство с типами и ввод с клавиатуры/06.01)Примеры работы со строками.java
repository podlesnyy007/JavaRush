/*
В переменную tagline нужно записать строку "JustDoIt".
Используй s1, s2, s3 и конкатенацию строк.
Требования:
•	Не изменяй значения переменных s1, s2, s3.
•	Для инициализации переменной tagline используй s1, s2, s3 и конкатенацию строк.
•	Программа должна выводить на экран значение переменной tagline.
*/

package com.javarush.task.pro.task02.task0207;

public class Solution 
{
    public static void main(String[] args) 
    {
        String s1 = "Do";
        String s2 = "It";
        String s3 = "Just";

        String tagline = s3 + s1 + s2;

        System.out.println(tagline);
    }
}
