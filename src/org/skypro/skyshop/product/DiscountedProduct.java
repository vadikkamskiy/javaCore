package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int price;
    DiscountedProduct(String name, int price, byte discount){
        super(name);
        this.price = (price/100)*(100-discount);
    }
    @Override
    public int getPrice() {
        return this.price;
    }
}
