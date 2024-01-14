/*
Давай напишем реализацию калькулятора, который будет считать степени чисел.
Для этого создай метод cube(). В качестве аргумента он должен принимать целочисленное значение типа long.
Метод должен возводить полученное значение в третью степень и возвращать его как результат работы метода.
Числа, которыми придется оперировать, могут быть большими. Поэтому метод cube() должен возвращать тип long.
Требования:
•	Должен быть создан метод public static long cube(long).
•	Метод cube() должен возвращать результат возведения переданного ему числа в третью степень.
*/

package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static long cube(long number) {
        return number * number * number;
    }
}
