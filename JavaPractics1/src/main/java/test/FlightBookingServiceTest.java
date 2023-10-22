package test;

import dev.failsafe.internal.util.Assert;
import org.booking.BookingService;
import org.booking.Customer;
import org.booking.FlightBookingService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightBookingServiceTest {

    @Test
    public void getTotalBookingsCountsIsIncreasedWhen1Booking () { // Создаю метод для проверки метода getTotalBookingsCounts у Flight сервиса
        FlightBookingService flightBookingService = new FlightBookingService(); // Соответственно начинаю создавать экземпляр Flight сервиса в методе
        for (int i = 0; i !=3; i++){
            flightBookingService.book(1, new Customer("Дима", "Булкин")); // Вызываю методы у данного класса и тут же создаю в конструкторе тестовых людей
        }
        int actualTotalBookingsCounts = flightBookingService.getTotalBookingsCounts();
        int expectedTotalBookingsCounts = 3;
        assertEquals(actualTotalBookingsCounts, expectedTotalBookingsCounts, "Total booking count is not correct");
    }

}
