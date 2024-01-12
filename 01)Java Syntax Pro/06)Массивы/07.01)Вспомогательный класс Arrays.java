/*
Реализуй метод main(String[]), который выводит массивы strings и ints в консоли с помощью метода Arrays.toString().
Требования:
•	В классе Solution должна быть публичная статическая переменная strings типа String[].
•	В классе Solution должна быть публичная статическая переменная ints типа int[].
•	В методе main(String[]) выведи в консоли массив strings с помощью метода Arrays.toString(Object[]).
•	В методе main(String[]) выведи в консоли массив ints с помощью метода Arrays.toString(int[]).
*/

package com.javarush.task.pro.task05.task0513;

import java.util.Arrays;

/* 
Выводим массивы
*/

public class Solution {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        String str1 = Arrays.toString(strings);
        String str2 = Arrays.toString(ints);

        System.out.println(str1);
        System.out.println(str2);
    }
}
