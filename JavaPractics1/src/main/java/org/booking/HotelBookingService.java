package org.booking;

public class HotelBookingService extends AbstractBookingService {

    // Тесты на проверку ID и bookingsCount , что оно не отрицательное, можно запихнуть в юнит тесты потом

    // Создаю метод для бронирования
    public void book(int id, Customer customer) { //конструктор принимает айдишник и поля из конструктора Customer
        System.out.println("Бронируем отель. Бронь №" + id + " " + customer.getFullName());
        bookingsCount++; //После каждой брони буду увеличиваться количество броней на 1
    }

    //  Метод для отмены броней
    public void cancel(int id) {
        System.out.println("Отменяем бронь в отеле  № " + id);
        if (bookingsCount >= 1) {
            bookingsCount--;
        } else {
            System.out.println("Нет броней в отеле " + bookingsCount);
        }
    }

    //Метод для возвращения количества текущих броней
    @Override
    public int getTotalBookingsCounts() {
        return bookingsCount;
    }



}
