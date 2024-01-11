/*
В этой задаче тебе нужно:
Считать 6 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
Примеры.
Массив после чтения строк:
{"Hello", "Hello", "World", "Java", "Tasks", "World"}
Массив после удаления повторяющихся строк:
{null, null, null, "Java", "Tasks", null}
Требования:
•	В методе main(String[]) считай с клавиатуры 6 строк и заполнить ими массив strings.
•	В методе main(String[]) удали(заменить строку на null) элементы из массива strings с одинаковыми строками.
*/

package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = console.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            // Для сохранения значения нужно использовать переменную,
            // иначе то,что мы поменяем на null так и будет сравниваться со следующими строками.
            String str = strings[i];
            for (int j = i + 1; j < 6; j++) {
                // Мораль задачи: мы не можем сравнивать null с чем либо.
                if (str != null && str.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
