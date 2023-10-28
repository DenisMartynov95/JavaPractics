package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"Футбольный мяч",135, 5));
        products.add(new Product(2,"Ноутбук",4329, 2));
        products.add(new Product(3,"Кофе",829, 14));
        products.add(new Product(4,"Рюкзак",4355, 23));
        products.add(new Product(5,"Мышь",1435, 11));

        Product product = new Product(products);

        product.viewProductList(products);
        product.getCountProducts();
        product.getTotalCountProducts();
        product.editProduct(1,"Мячик",145,3);
        product.viewProductList(products);
        product.editProduct(55,"Мячик",145,3);

//        product.addNewProduct(4,new Product(6,"Наушники",433,2));
//        product.viewProductList(products);
//
//        product.deleteProduct(5);
//        product.viewProductList(products);


    }
}