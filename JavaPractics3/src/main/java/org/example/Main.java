package org.example;

public class Main {
    public static void main(String[] args) {

        // Тема: типы данных, методы классов обёрток и парсинг

//        //Преобразовываю int в string разными способами
//        int a = 75; // Первый способ
//        String str = a + " ";
//        System.out.println(str);
//
//        String str1 = String.valueOf(a); // Второй способ, парсю через String.valueOf()
//        System.out.println(str1);
//
//        //Преобразовываю string в int разными способами
//        String string = "75.5";
//        double b = Double.parseDouble(string); // Для Double, Integer, Float и других, используется Double.parseDouble() , Integer.parseInteger() ...
//        System.out.println(b);

        // Задача №1: Метод должен вернуть сумму двух чисел, которые передаются как строки. На вход даются "10" и "5", должна вернутся сумма 15. В коде изначально допущена ошибка, нужно исправить её.
        // Моё решение в классе FirstTask
        String firstNumber = "10";
        String secondNumber = "5";
        FirstTask firstTask = new FirstTask();
        System.out.println(FirstTask.sumStrNumbers(firstNumber, secondNumber));


        // Тема: конструкторы, модификаторы доступа и инкапсуляция, геттеры и сеттеры (Повторение тем)
        Person person1 = new Person();
        Person person2 = new Person(18);
        Person person3 = new Person(13,"AA", "BB");

        person1.printAllInfo();
        person2.printAllInfo();
        person3.printAllInfo();


        //Задача №2: В классе MelonStorage задание и решение

        MelonStorage melonStorage = new MelonStorage(300);
        //Выведи количество дынь на складе до и после вывоза
        System.out.println(melonStorage.getMelonAmount());
        melonStorage.reduceMelonAmount(1000);
        System.out.println(melonStorage.getMelonAmount());

    }
}