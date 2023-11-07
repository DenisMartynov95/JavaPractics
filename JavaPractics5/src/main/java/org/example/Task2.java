package org.example;

public class Task2 {
    // Задачка из книги по Java для того чтобы вывести определенный результат используя циклы и условия. А так же только доступные фрагменты кода, которые нельзя использовать дважды

        int x = 0;
        public  void PoolPuzzleOne() {
        while ( x < 4 ){
        System.out.print("a");
        if( x < 1 ){
            System.out.print(" ");
        }
        System.out.print("n");
        if ( x > 1 ){
            System.out.print(" oyster");
            x = x + 2;
        }
        if ( x == 1 ){
            System.out.print("noys");
        }
        if ( x < 1 ){
            System.out.print("oise");
        }
        System.out.println("");
        x = x + 1;
    }
    }
}
