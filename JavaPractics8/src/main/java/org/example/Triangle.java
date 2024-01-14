package org.example;


/*
        Головоломка из книги
                                  */
public class Triangle {
    double area;
    double height;
    double length;

    public static void main(String[] args) {
        int x = 0; // Строка для подстановки
        Triangle [] ta = new Triangle[4]; // Строка для подстановки

        while (x < 4) { // Строка для подстановки
            ta[x] = new Triangle(); // Строка для подстановки
                    ta[x].height = (x + 1) * 2;
                    ta[x].length = x + 4;
            ta[x].setArea(); // Строка для подстановки

            System.out.println("треугольник " + x + " , зона");;
            System.out.println(" = " + ta[x].area);
            x = x + 1; // Строка для подстановки
        }
        int y = x; // Строка для подстановки
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.println("y + " + y);
        System.out.println(" ,  зона t5 = " + t5.area);
    }
    void setArea() {
        area = (height * length) / 2; // Строка для подстановки
    }
}
