package Transports;

import Interfaces.Functions;

import java.util.Scanner;

import static ChargeStations.ChargeStations.chargeStations;

public class Tesla extends Car implements Functions {

        private int charge;
        public static int chosenStation;

    public Tesla(int countWheels, String carName, int countDoors, int maxPower, int charge){
            super(countWheels, carName, countDoors, maxPower);
            this.charge = charge;
    }


    @Override
        public void startEngine () {
            if (charge > 61) {
                charge = charge - 30;
                System.out.println("Машина " + getCarName() + " завелась");
                System.out.println("Уровень заряда изменился!" + charge);
            } else if (charge <= 60 && charge > 31) {
                charge = charge - 30;
                System.out.println("Машина " + getCarName() + " завелась");
                System.out.println("Уровень заряда изменился!" + charge);
                System.out.println("Необходимо зарядить батарею!");
            } else if (charge <= 30) {
                System.out.println("Машина " + getCarName() + " не завелась");
                System.out.println("Нехватает заряда батареи!" + charge);
            }
        }

        @Override
        public void turnLightsOn () {
        if (charge > 31) {
            System.out.println("Фары включены!");
            charge = charge - 10;
        } else if (charge <=30) {
            System.out.println("Отказ системы, фары не включились");
         }
        }


        @Override
        public void chooseChargeStation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер заправочной станции: ");
            chosenStation = scanner.nextInt();
            if (chosenStation < 3) {
                System.out.println("Выбранная заправочная станция: " + chosenStation);
            } else {
                System.out.println("Некорректная заправочная станция!Заправочных станций только " + chargeStations.size());
            }

            switch (chosenStation) {
                case (1) :
                    charge = charge + chargeStations.get(0);
                    System.out.println("Заправочная станция №1. Мощность будет пополнена до 300");
                    break;
                case (2) :
                    charge = charge + chargeStations.get(1);
                    System.out.println("Заправочная станция №2. Мощность будет пополнена до 500 ");
                    break;
            }
        }


        @Override
        public void checkCharge() {
        System.out.println("Текущее состояние батареи: " + charge);
        }

}

