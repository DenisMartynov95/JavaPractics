package org.example;

import java.util.Random;

public class Task {

    Random randomForArr1 = new Random();
    Random randomForArr2 = new Random();
    Random randomForArr3 = new Random();


    String [] arr1 = {"Вкусная", "Сладкая", "Сочная", "Горькая", "Солёная", "Кислая"};
    String [] arr2 = {"Пышка", "Булочка", "Макароша",  "Салфетка", "Сосиска"};
    String [] arr3 = {"Ща выплюну!", "Ща съем!", "Ща выкину!", "ДАЙТЕ ИСЧО!"};

    public void randomPhrase() {
        int randomNumberForArr1 = randomForArr1.nextInt(arr1.length);
        int randomNumberForArr2 = randomForArr2.nextInt(arr2.length);
        int randomNumberForArr3 = randomForArr3.nextInt(arr3.length);
        System.out.println(arr1[randomNumberForArr1] + " " + arr2[randomNumberForArr2] + " " + arr3[randomNumberForArr3]);


//        for (int i = 0; i <arr1.length; i++) {
//            System.out.println(arr1[randomNumber]);
//        }
    }


}
