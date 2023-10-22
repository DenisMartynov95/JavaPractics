package org.booking;

public interface BookingService { // Интерфейс, где я перечислил все одинаковые методы для двух сервисов

    void book(int bookingId, Customer customer);

    void cancel(int bookingId);

    int getTotalBookingsCounts();
}
