package org.skypro.skyshop.product;

public class Product {
    private final String nameOfProduct;
    private final int priceOfProduct;

    public Product(String name, int price){
        nameOfProduct = name;
        priceOfProduct = price;
    }

    public String toString(){
        return nameOfProduct + " : " + priceOfProduct + '\n'; 
    }
    public int getPrice(){
        return priceOfProduct;
    }
    public String getName(){
        return nameOfProduct;
    }
}
