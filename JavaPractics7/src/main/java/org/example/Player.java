package org.example;

import java.util.Random;

public class Player {
    Random random = new Random();

    public int guessNumber() {
       int randomNumber = random.nextInt(9);
        System.out.println("Думаю число: " + randomNumber);
        return randomNumber;
    }
}
