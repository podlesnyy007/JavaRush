/*
Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Примеры:
a) при вводе чисел 1 2 2 получим вывод 2 2
b) при вводе чисел 2 2 2 получим вывод 2 2 2
Требования:
•	Программа должна считывать три числа c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если два числа равны между собой, необходимо вывести их на экран.
•	Если все три числа равны между собой, необходимо вывести все три.
•	Если нет равных чисел, ничего не выводить.
*/

package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        if (a == b) {
            if (b == c)
                System.out.println(a + " " + b + " " + c);
            else
                System.out.println(a + " " + b);
        }
        else if (b == c)
            System.out.println(b + " " + c);
        else if (a == c)
            System.out.println(a + " " + c);
    }
}
