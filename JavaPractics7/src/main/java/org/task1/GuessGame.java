package org.task1;

import java.util.Random;

public class GuessGame {

    Random randomNumber = new Random();

    public void startGame() {
        boolean cycleEndPoint = false; // Задаю эндпоинд для цикла, чтобы прекратить цикл while, когда значение поменяется на true
        int countGame = 0; // Счётчик для количества игр


        while (cycleEndPoint != true) {
            countGame = countGame + 1;
            int makeANumber = randomNumber.nextInt(9);
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        System.out.println(" ");
        System.out.println("Игра №" + countGame);
        System.out.println("Было загадано число: " + makeANumber);
        System.out.println(" ");

        System.out.println("Игрок №1 отвечает: ");
        int targetNumberForPlayer1 = player1.guessNumber();

        System.out.println("Игрок №2 отвечает: ");
        int targetNumberForPlayer2 = player2.guessNumber();

        System.out.println("Игрок №3 отвечает: ");
        int targetNumberForPlayer3 = player3.guessNumber();

                if (targetNumberForPlayer1 == makeANumber) {
                    System.out.println("_________________");
                    System.out.println("Игрок №1 победил!");
                    cycleEndPoint = true;
                } else if (targetNumberForPlayer2 == makeANumber) {
                    System.out.println("_________________");
                    System.out.println("Игрок №2 победил!");
                    cycleEndPoint = true;
                } else if (targetNumberForPlayer3 == makeANumber) {
                    System.out.println("_________________");
                    System.out.println("Игрок №3 победил!");
                    cycleEndPoint = true;
                } else {
                    System.out.println(" ");
                    System.out.println("Никто не победил, начинаем заново!");
                    cycleEndPoint = false;
                }
          }
    }
}
