package org.example;

public class FirstTask {


//    public  static int sumStrNumbers(String firstNumber, String secondNumber) { // Дан метод, в котором допущена ошибка
//        return Integer.parseInt(firstNumber + secondNumber);

        //Мое решение
        public  static int sumStrNumbers(String firstNumber, String secondNumber) {
        Integer a = Integer.parseInt(firstNumber); // Распаршиваю строки в Integer, и помещаю их в отдельные переменные
        Integer b = Integer.parseInt(secondNumber);
            return a + b; // Возвращаю сумму

//        //Второй вариант решения
//        public  static int sumStrNumbers(String firstNumber, String secondNumber) {
//            return Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
//            }
    }
}