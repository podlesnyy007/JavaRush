/*
Напишем программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
Для этого тебе нужно:
1.Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
2.Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде: "треугольник существует" или "треугольник не существует".
Чтобы это выяснить, нужно сравнить каждую сторону с суммой двух других.
То есть, тебе нужно выполнить три сравнения:
1.Если в каждом сравнении сторона меньше суммы двух других, то треугольник с такими сторонами существует.
2.Если хотя бы в одном случае сравнения одна сторона окажется больше или равна сумме двух других, то треугольника с такими сторонами не существует.
Требования:
•	Программа должна считывать три числа c клавиатуры.
•	Программа должна выводить текст на экран согласно условию задачи.
•	Если треугольник с такими сторонами может существовать, необходимо вывести текст: "треугольник существует".
•	Если треугольник с такими сторонами не может существовать, необходимо вывести текст: "треугольник не существует".
*/

package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

public class Solution 
{
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        int sideA = console.nextInt();
        int sideB = console.nextInt();
        int sideC = console.nextInt();
        
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA)
            System.out.println(TRIANGLE_EXISTS);
        else
            System.out.println(TRIANGLE_NOT_EXISTS);
    }
}
