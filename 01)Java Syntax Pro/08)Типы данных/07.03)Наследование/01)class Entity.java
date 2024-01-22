/*
Правильно унаследуй классы:
человека — от существа;
Java-девелопера — от человека.
Удали дублирующие методы.
Требования:
•	Класс Human должен наследоваться от класса Entity.
•	Класс JavaDeveloper должен наследоваться от класса Human.
•	Дублирующих методов не должно быть.
*/

package com.javarush.task.pro.task07.task0715;

/* 
Наследование методов
*/

public class Entity {
    public void move() {
        System.out.println("Я передвигаюсь.");
    }

    public void eat() {
        System.out.println("Я ем.");
    }
}
