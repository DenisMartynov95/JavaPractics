package org.example;

import java.util.Random;

public class Task1 {
    /*
    Задача №1
    В магазин приехала первая поставка товара: нужно занести её в базу данных.
    Список техники: "Стиральная машина", "Сушильная машина", "Холодильник", "Утюг", "Посудомоечная машина", "Микроволновая печь", "Варочная поверхность", "Духовой шкаф", "Блендер", "Миксер". Ты можешь скопировать его, чтобы заполнить массив.
    Заказано по 10 единиц каждой техники, но прибыл не весь заказ, поэтому количество техники каждого вида случайно.
    Чтобы заполнить базу данных, нужно создать два массива одинакового размера. В первом будут храниться наименования техники, во втором — её количество.
    Нужно сопоставить два массива и вывести результат на экран.
     */

    Random randomCounts = new Random();
    private String [] technics = {"Стиральная машина", "Сушильная машина", "Холодильник", "Утюг", "Посудомоечная машина", "Микроволновая печь", "Варочная поверхность", "Духовой шкаф", "Блендер", "Миксер"};
    private int [] countArray = new int[10];

    public void randomCountsForTechnics() { // Заполнить массив количества рандомным количеством техники
        for (int i = 0; i < countArray.length; i++) {
            countArray[i] = randomCounts.nextInt(15);
        }
    }

    public void printTechnicsAndHisCounts() {
        for (int i = 0; i < technics.length; i++) {
            int index = 1 + i; // не логично будет, если счёт товара будет выводится с нуля
            System.out.println("Товар №" + index);
            System.out.println("Наименование: " + technics[i] + ". Количество: " + countArray[i]);
            System.out.println("_____________________________________________________________");
        }
    }

    /*
        Продолжение задачи: В магазине распродажа.
        Поменяй порядок элементов: сделай первым элементом духовой шкаф и объяви на него скидку.
     */
    public void changeTechnics() {
        technics[7] = "Стиральная машина";
        technics[0] = "Духовой шкаф";
        int [] indexes = new int[10]; // Создал массив с ID у товаров
        for (int i = 0; i < technics.length; i++) {
            for (int j = 0; j < indexes.length; j++){ // Заполнил счётчик товаров, чтобы у каждого товара был свой ID
                indexes[j] = j + 1;
            }
        }
        System.out.println("Товар №" + indexes[0]); // И вывел тут нужный ID
        System.out.println("Наименование товара: " + technics[0] + " Изменился порядок товара!");
        System.out.println("_____________________________________________________________");
        System.out.println("Распродажа -20% на категорию месяца: " + technics[0]);
    }

    /*
    Продолжение задачи: Дела у магазина идут хорошо: нужно расширить ассортимент.
    Напиши новый массив с новыми значениями — Кофемашина, Чайник, Тостер.
    Объедини два массива и выведи старый ассортимент и новый ассортимент на экран.
     */
    String [] newTechnics = {"Кофемашина", "Чайник", "Тостер"};
                //    String [] refreshTechnics = new String[13];
//    int firsArray = technics.length; // Количество индексов первого массива с техникой
//    int secondArray = newTechnics.length; // Количество индексов второго массива
//    int[] refreshTechnics = new int [firsArray + secondArray]; // Пробую увеличить размер массива
    String [] refreshTechnics = new String[technics.length + newTechnics.length]; // этот варик работает криво

    public void addNewTechnics() {

                // Блок для отладки работы массива, интересно как он расширяется
//        int [] refreshTechnicsLogs = new int[technics.length + newTechnics.length+1];
//        for (int i = 0; i < refreshTechnics.length; i++) {
//            int index = 0 + i;
//            refreshTechnicsLogs[i] = index;
//            System.out.println(refreshTechnicsLogs[i]);
//        }

        for (int i = 0; i < technics.length; i++) {  // Некорректно работал цикл, тк была зависимость от размерности refreshTechnics, а не от technics
            // НА БУДУЩЕЕ ЗАПОМНИТЬ!!! ПРОХОДИТЬ ПО ТЕМ МАССИВАМ, У КОТОРЫХ НУЖНЫ НЕОБХОДИМЫЕ ДАННЫЕ refreshTechnics - был пустой!!!, а в technics у меня содержались нужные товары
            refreshTechnics[i] = technics[i]; // Присобачиваю новую технику technics к массиву refreshTechnics
        }
        for (int i = 0; i < newTechnics.length; i++) { // та же ситуация
            refreshTechnics[technics.length + i] = newTechnics[i]; // С подсказками допер как доделать иттерацию, ОБЪЯСНЯЮ НИЖЕ самому себе на будущее:
            /*
             этом цикле мы начинаем с индекса, который равен размеру массива technics. Это нужно, чтобы добавить новые элементы из массива newTechnics в конец массива refreshTechnics, чтобы не затирать уже существующие элементы.
             Поскольку массивы индексируются с 0, мы начинаем с индекса technics.length, и прибавляем i, чтобы перейти по порядку по элементам массива newTechnics.
             Таким образом, новые элементы добавляются в refreshTechnics начиная с индекса, следующего за последним элементом массива technics.
             */
        }

        for (int i = 0; i < refreshTechnics.length; i++) {
            // Впихну-ка я дополнительно нумерацию айдишниками у каждого товара
            int idTech = 1 + i;
            System.out.println("Номер товара: " + idTech);
            System.out.println(refreshTechnics[i]);
            System.out.println("______________________________");
        }

    }

}
