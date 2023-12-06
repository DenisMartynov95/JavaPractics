import java.util.Arrays;
import java.util.Random;

public class Task3 {
    /*
    1) Создай массив из 10 элементов
    2) Вначале заполни его рандомными чётными числами
    3) Затем элементы, которым было присвоено число 0 замени на рандомные чётные числа, любым известным тебе способом
    4) Вычисли среднее значение в массиве
    5) Вычисли среднее значение КАЖДОГО элемента в массиве
    6) Верни МАКСИМАЛЬНОЕ и МИНИМАЛЬНОЕ значение элемента в массиве
    7) Отсортируй массив по возрастанию
     */

    Random random = new Random();
    int arr[] = new int[10];

    public void fillArrayRandomsNumbers() {
        for (int i = 0; i < arr.length; i++) {
            int a = random.nextInt(100);
            System.out.println("Сгенерировано число: " + a);
            if (a % 2 == 0) {
                arr[i] = a;
            }
        }
        System.out.println("Массив заполнен следующими элементами: " + Arrays.toString(arr));
        System.out.println("Как видим есть числа 0, которые остались при не выполненному условии чётности");
        System.out.println("Задание №1 выполнено!");
        System.out.println(" ");
    }

    public void editArrayAndReplaceZeroNumbers() {
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == 0) {
                int b = random.nextInt(100);
                if (b % 2 != 0) {
                    b = b - 1;
                }
                arr[i] = b;
            }
        }
        System.out.println("Массив заполнен следующими элементами: " + Arrays.toString(arr));
        System.out.println("Задание №2 выполнено!");
        System.out.println(" ");
    }

    int average = 0;
    public void averageMeaning() {
        for (int i = 0; i < arr.length; i++) {
            average = average + arr[i];
            System.out.println("Логирую переменную average: " + average);
        }
        average = average / 2;
        System.out.println("Среднее значение массива: " + average);
        System.out.println("Задание №3 выполнено!");
        System.out.println(" ");
    }

    public void averageMeaningOnArray() {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            average = arr[i] / 2;
            System.out.println("Среднее значение элемента: " + index + " равно: " + average);
        }
        System.out.println("Задание №4 выполнено!");
        System.out.println(" ");
    }

    int min = arr[0];
    int max = arr[0];
    public void maxAndMinMeaning() {
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Самое минимальное число: " + min);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Самое максимальное число: " + max);
        System.out.println("Задание №5 выполнено!");
        System.out.println(" ");
    }

    public void sortArray() {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int values = arr[i];
            System.out.print(values + ", ");
        }
    }

}
