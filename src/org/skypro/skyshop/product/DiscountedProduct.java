package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int price;
    private byte discount;
    public DiscountedProduct(String name, int price, byte discount){
        super(name);
        this.price = (price/100)*(100-discount);
        this.discount = discount;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
    @Override
    public String getInfo(){
        return getName() +" : "+ this.price + " (скидка - " + this.discount + "%)\n";
    }
    @Override
        public boolean isSpecial(){
            return true;
        } 
}
