package org.skypro.skyshop.product;

public abstract class Product {
    private final String nameOfProduct;
    

    public Product(String name){
        nameOfProduct = name;
        
    }
    @Override
    public String toString(){
        return nameOfProduct; 
    }
    public abstract int getPrice();

    public String getName(){
        return nameOfProduct;
    }
    public abstract String getInfo();
}
