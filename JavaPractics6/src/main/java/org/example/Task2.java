package org.example;

import java.util.HashMap;

public class Task2 {
    /*
    Решил попробовать решить ту же задачу но с использованием ЛИСТОВ

    Задача №1
    Составить хеш мап или список с товарами. Решил Хеш мап, тк там можно сразу ID указать у каждого товара
     */

    private static final HashMap<Integer,String> technics = new HashMap<>(); // если будет ошибка, убрать статик и файнал
    static {
        technics.put(1 ,"Стиральная машина");
        technics.put(2, "Сушильная машина");
        technics.put(3, "Холодильник");
        technics.put(4, "Утюг");
        technics.put(5, "Микроволновая печь");
        technics.put(6, "Варочная поверхность");
        technics.put(7, "Духовой шкаф");
        technics.put(8, "Блендер");
        technics.put(9, "Миксер");
        technics.put(10, "Посудомоечная машина");
    }

    public HashMap<Integer, String> printTechnics() { // IDEA сама подсказала что нужно указать HashMap<Integer, String>, ЗАПОМНИТЬ!!!
        for (int i = 1; i < technics.size();i++){
            System.out.println(technics.get(i));
        }
        return technics;
    }
    // Понял суть HashMap. У каждого товара есть ключ, это не ID!, по нему можно обращаться к ячейке и что-то делать с ней

    /*
    Задача №2: В магазине распродажа.
    Поменяй порядок элементов: сделай первым элементом духовой шкаф и объяви на него скидку.
     */

    public void changeTechnics() {
        technics.put(1,"Духовой шкаф");
        technics.put(7,"Стиральная машина");
        technics.get(1);
        technics.get(7);
        System.out.println("________________");
        System.out.println(technics.get(1) + " Скидка 20%!!!");
        System.out.println("________________");
    }

        /*
    Задача №3: Добавь новые товары

     */

    public void addNewTechnics() {
        for (int i = 1; i < technics.size()+2; i++) {
            switch (i) {
                case 11 : technics.put(11,"Кофемашина");
                break;
                case 12 : technics.put(12,"Чайник");
                break;
                case 13 : technics.put(13,"Тостер");
                break;
            }
            System.out.println("Добавлены новые товары: " + technics.get(i));
        }
        System.out.println("Количество товаров: " + technics.size());
    }
}
