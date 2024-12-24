package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int PRICE_FIXED = 7590 ;
    public FixPriceProduct (String name){
        super(name);
    }


    @Override
    public int getPrice() {
        return PRICE_FIXED;
    }

    @Override
    public String getInfo(){
        return this.getName() + " : Фиксированная цена " + PRICE_FIXED + "\n";
    }
    @Override
        public boolean isSpecial(){
            return true;
        }
}
