package org.skypro.skyshop.product;

public class SampleProduct extends Product {
    private static String name;
    private int price;
    public SampleProduct(String n ,int p,Article a){
        super(n,a);
        price = p;
    }
    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public boolean isSpesial() {
        return false;
    }

    public String toString() {
        String output = "";
        output+=this.getName()+": ";
        output+=this.getPrice();
        return output;
    }

    @Override
    public String getType(){
        return "is regular";
    }

}
