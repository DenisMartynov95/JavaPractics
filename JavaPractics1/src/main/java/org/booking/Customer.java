package org.booking;

public class Customer { // Класс для клиентов

    private final String  firstName;
    private final String  lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFullName() {
        return firstName + " " + lastName;
    }


}
