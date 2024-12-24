package org.skypro.skyshop.product;

public abstract class Product {
    private final String nameOfProduct;
    public abstract boolean isSpecial();

    public Product(String name){
        nameOfProduct = name;
        
    }
    public abstract int getPrice();

    public String getName(){
        return nameOfProduct;
    }
    public abstract String getInfo();

}
