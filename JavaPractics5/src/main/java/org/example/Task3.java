package org.example;

import java.util.Random;

public class Task3 {

    /*
    Заполни массив выпитой воды за неделю — waterConsumption. Примени цикл for.
    Потребление за день определяется случайно — через генератор случайных чисел Random с промежутком от 2000 до 4000 мл.
    Напечатай значения элементов массива с помощью цикла
    И еще одним методом вывести общее количество выпитой воды за 7 дней
     */
    Random random = new Random();
    static int [] waterConsumption = new int[7]; // Массив для дня, в каждый день должно будет фиксироваться определенное количество выпитой воды
    int day = 0;
    public int maxDrunk = 4000;
    public int minDrunk = 2000;
    public static int totalConsumption = 0; // Сделал ее статичной, тк должен хранить состояние после каждой итерации

    public void consumptionCounter() {
        for (int i = 0; i < waterConsumption.length; i++) {
            day++;
            System.out.println("День : " + day);
            int diff = maxDrunk - minDrunk;
            int randomDrunk = random.nextInt(diff + 1) + minDrunk;
                                        /*
                                        System.out.println("________________________________________________");
                                        System.out.println("Логгирование состояния переменной randomDrunk: " + randomDrunk);
                                        System.out.println("________________________________________________");
                                        */

            waterConsumption[i] = randomDrunk;
            System.out.println("Выпито за этот день: " + waterConsumption[i]);
        }
    }

        public void countTotalConsumption() {
        // Цикл подсчёта общего количества выпитой воды
        for (int i = 0; i < waterConsumption.length; i++){
            totalConsumption = totalConsumption + waterConsumption[i];
        }
            System.out.println("Общее количество выпитой воды за 7 дней составляет: " + totalConsumption);

    }


}
