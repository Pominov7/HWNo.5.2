package com.company;

public class Task1 {
    public static void main(String[] args) {
        //1.Объявляем массив arr
        int[] arr = new int[15];// выделили память на 15 элементов
        int n1 = 1, n2 = 1;//Объявляем переменные

        //2.Находим первые 15 чисел Фибоначчи с помощью цикла for
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                n1 += n2;
                arr[i] = n1;
            } else {
                n2 += n1;
                arr[i] = n2;
            }
        }
        System.out.print("Первые 15 чисел Фибоначчи: [ ");
        for (int item : arr) {
            // Вывод полученного массива в консоль
            System.out.print(item + " ");
        }
        System.out.print("]" + "\n");//Ставим пробел
        //В этом цикле for мы заполняем массив только чётными числами,
        //Фибоначчи входящими в первые 15 чисел.
        System.out.print("Чётные числа Фибоначчи: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {// условие для определения чётных чисел
                System.out.print(arr[i] + " ");//Вывод полученного массива в консоль
            }
        }
    }
}


