package org.booking;

public class FlightBookingService extends AbstractBookingService {

    // Тесты на проверку ID и bookingsCount , что оно не отрицательное, можно запихнуть в юнит тесты потом

    // Создаю метод для бронирования
    public void book(int id, Customer customer) { //конструктор принимает айдишник и поля из конструктора Customer
        System.out.println("Бронь номер: " + id + " " + customer.getFullName());
        bookingsCount++; //После каждой брони буду увеличиваться количество броней на 1
    }

    //  Метод для отмены броней
    public void cancel(int id) {
        System.out.println("Отменяем бронь, номер:  " + id);
        if (bookingsCount >= 1) {
            bookingsCount--;
        } else {
            System.out.println("Нет активных броней " + bookingsCount);
        }
    }

    //Метод для возвращения количества текущих броней
    public int getTotalBookingsCounts() {
        return bookingsCount;
    }




}