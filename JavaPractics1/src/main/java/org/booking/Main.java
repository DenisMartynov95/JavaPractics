package org.booking;

public class Main {
    /*Задание:
     1. Сделать сервис бронирования авиабилетов
     1.1 Сервис позволяет бронировать
     1.2 Сервис позволяет отменить бронь
     1.3 Сервис позволяет получить текущее количество броней
     2. Сделать сервис бронирования отелей
     2.1 Сервис позволяет бронировать
     2.2 Сервис позволяет отменить бронь
     2.3 Сервис позволяет получить текущее количество броней
     3. Программа должна поддерживать оба сервиса
     */


    public static void main(String[] args) {


        Customer customer1 = new Customer("Вася", "Пупкин");
        Customer customer2 = new Customer("Денис", "Мартынов");


        BookingService bookingService = new FlightBookingService();
        bookingService.book(1, customer2);
        System.out.println("Количество текущих броней : " + bookingService.getTotalBookingsCounts());
        bookingService.cancel(1);
        System.out.println("Количество текущих броней : " + bookingService.getTotalBookingsCounts());


        // Новая задача:
        // 1. Вывести массив в прямом порядке
        // 2. В обратном порядке
        // 3. Найти произведение всех элементов
        // 4. Каждый элемент массива увеличить на 3
        // 5. Вывести только четные элементы

        int[] mas = {1, 2, 5, -8, 0, 6}; // Дан массив

        // 1. Вывести массив в прямом порядке
        for (int i = 0; i != mas.length; i++) {
            System.out.print(mas[i] + " "); // Print, чтобы не в столбик выводилось
        }

        System.out.println();

        // 2. В обратном порядке
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        // 3. Найти произведение всех элементов
        int multiplication = 1; // Единичка, тк если бы было 0 ,то было бы бесмысленно умножать.
        for (int i = 0; i != mas.length; i++) {
            multiplication = multiplication * mas[i];
        }
        System.out.print(multiplication + " ");

        System.out.println();

        // 4. Каждый элемент массива увеличить на 3
        int plusThree = 3;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = mas[i] + plusThree;
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        // 5. Вывести только четные элементы
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                System.out.print(mas[i] + " ");
            }
        }
    }
}
