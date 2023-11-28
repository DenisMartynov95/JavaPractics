package org.example;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    /*
            Соединить два массива. Массив №1 и №2 заполнить рандомными значениями от 1 до 100
                                        */

    Random random = new Random();

    private static int[] arr1 = new int[5];
    private static int[] arr2 = new int[5];

    public void createArrays() {
        // №1 Заполню первый массив
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
//            System.out.println("Массив №1 заполнен значениями: " + arr1[i]);
        }
        System.out.println("Массив №1 заполнен значениями: " + Arrays.toString(arr1));

        // №2 Заполню второй массив
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(100);
        }
        System.out.println("Массив №2 заполнен значениями: " + Arrays.toString(arr2));
    }

    // №3 Создаю третий массив и в нем объединяю
    public void createThirdArray() {
        int[] arr3 = new int[arr1.length + arr2.length];

        //Прохожу по массиву №1 и дополняю его в массив №3
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        } System.out.println("Третий массив заполнен значениями из массива №1: " + Arrays.toString(arr3));

        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i]; // Чтобы не затирать уже существующие элементы массива arr3, выбираю те ячейки, которые свободны от новых значений arr1.length + i
        } System.out.println("Третий массив заполнен значениями из массива №2: " + Arrays.toString(arr3));
    }

}
