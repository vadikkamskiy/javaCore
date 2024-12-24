package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int PRICE_FIXED = 7590 ;
    public FixPriceProduct (String name){
        super(name);
    }


    @Override
    public int getPrice() {
        return PRICE_FIXED;
    }}
