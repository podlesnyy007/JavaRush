/*
Правильно унаследуй классы:
машину — от транспортного средства;
электрокар — от машины.
Удали дублирующиеся переменные.
Требования:
•	Класс Car должен наследоваться от класса Vehicle.
•	Класс ElectricCar должен наследоваться от класса Car.
•	Дублирующих переменных не должно быть.
*/

package com.javarush.task.pro.task07.task0714;

/* 
Наследование переменных
*/

public class Vehicle {
    double maxSpeed;
}
