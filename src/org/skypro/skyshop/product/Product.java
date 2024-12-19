package org.skypro.skyshop.product;

public class Product {
    private int productId;
    private String nameOfProduct;
    private int priceOfProduct;

    public Product(int id,String name, int price){
        productId = id;
        nameOfProduct = name;
        priceOfProduct = price;
    }

    public String toString(){
        return productId + ". " + nameOfProduct + " : " + priceOfProduct + '\n'; 
    }
    public int getPrice(){
        return priceOfProduct;
    }
    public String getName(){
        return nameOfProduct;
    }
    public void setName(String name){
        nameOfProduct = name;
    }
    public void setPrice(int price){
        priceOfProduct = price;
    }
}
