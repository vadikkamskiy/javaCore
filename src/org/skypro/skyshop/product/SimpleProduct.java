package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    private int price;
    public SimpleProduct(String name,int price){
        super(name);
        this.price = price;
        
    }
    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getInfo(){
        return this.getName() + " : " + this.price + "\n";
    }

    @Override 
    public boolean isSpecial(){
        return false;
    }
}
