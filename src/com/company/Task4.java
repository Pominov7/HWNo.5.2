package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //1.Объявление переменной и массива
        Scanner in = new Scanner(System.in);//создали сканер
        System.out.print("Введите длину массива: ");
        int n = in.nextInt();//Объявляем переменную для ввода длины массива
        int[] arr = new int[n];//Объявляем массив arr
        boolean flagStop = false;// флаг завершения цикла

        //2.установка значений массива в цикле for
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент массива " + (i + 1) + ": ");//ввод с клавиатуры
            arr[i] = in.nextInt();//чтение введенных значений
        }
        //Сравниваем каждый элемент массива с предыдущим
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[0] == arr[i + 1]) {
                flagStop = true;
                break;
            }
        }
        if (!flagStop) { //Если элементы масива различные (не повторяются),выводим Yes
            System.out.print("Yes");
        } else {
            System.out.print("No");//Если имеется хоть одно повторение,выводим No
        }
    }
}
    


