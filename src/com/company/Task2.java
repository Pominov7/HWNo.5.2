package com.company;

public class Task2 {
    public static void main(String[] args) {
        //1.Объявляем массив arr
        int[] arr = new int[30]; // выделили память на 30 элементов
        int min = 0; //Объявляем переменные
        int max = 0;

        //2.Заполняем массив рандомными числами в диапазоне от-70 до +50
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 120 - 70);
            System.out.print(arr[i] + " ");// Вывод полученного массива в консоль
        }
        //В этом цикле for будем искать максимальный и минимальный элементы массива
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            } else if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println("\nМаксимальный элемент массива: " + max);
        System.out.println("Минимальный  элемент массива: " + min);
    }
}