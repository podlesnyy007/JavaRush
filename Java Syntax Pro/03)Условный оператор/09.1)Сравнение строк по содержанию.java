/*
Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
Требования:
•	Программа должна считывать две строки c клавиатуры.
•	Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
•	Если строки разные, то программа должна вывести сообщение "строки разные".
*/

package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str1 = console.nextLine();
        String str2 = console.nextLine();
        
        if (str1.equals(str2))
            System.out.println("строки одинаковые");
        else
            System.out.println("строки разные");
    }
}
