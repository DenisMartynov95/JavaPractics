package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Product {

    private String name;
    private int price;
    private int count;



    private int id;
    private static ArrayList<Product> products;

    public void viewProductList(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.println("ID товара: " + product.getId() +",  Наименование товара: " + product.getName() + ", Цена товара: " + product.getPrice() + ", Количество товара: " + product.getCount());
        }
    }


    public void addNewProduct(int index, Product product) {
        //Добавляю проверку на уникальность ID. ПОЯСНЯЮ ЧТОБЫ МОГ ВСПОМНИТЬ ЧТО Я ТУТ СДЕЛАЛ:
        boolean isUnique = true; // Вывожу переменную Уникальный? со значением true
        for (Product existingProductId : products) { // Перебираю список products и кладу каждую итерацию (true или false) в переменную existingProductId
            if (product.getId() == existingProductId.getId()) { // Далее просто сравниваю, какой ID я хотел ввести и имеется ли данный ID в листе
                isUnique = false;
                System.out.println("Товар с ID: " + product.getId() + "  Уже существует! Впишите другой ID"); // Текст ошибки
                break; // Прерываю добавление
            }

        }
        if (isUnique) { // А тут уже добавляю товар, если валидатор пропустил
            products.add(index, product);

            System.out.println("_______________________________");
            System.out.println("Товар " + product.getName() + " добавлен!");
            System.out.println("ID товара: " + product.getId());
            System.out.println("_______________________________");
        }
    }

    public void deleteProduct(int index) {
        products.remove(index);
    }

    public void editProduct(int id, String name, int price, int count) {
        for (int i = 0; i < products.size(); i++) {
           Product checkProduct = products.get(i);
            if (checkProduct.getId() == id) {
                checkProduct.setId(id);
                checkProduct.setName(name);
                checkProduct.setPrice(price);
                checkProduct.setCount(count);
                return;
            }
        }
        System.out.println("Товар с ID: " + id + " не найден!");
    }




    public void getCountProducts() {
        int quantity = products.size();

        System.out.println("Всего уникальных позиций: " + quantity);

    }

    public void getTotalCountProducts() {
        int sumCountProducts = 0;
        for (Product totalCount : products) {
            sumCountProducts += totalCount.getCount();
        }
        System.out.println("Общее количество товаров на складе: " + sumCountProducts );
    }


    public Product(int id,String name,int price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }
    public Product(){}
    public Product(ArrayList<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

