package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class Basket {
    private static int id = 0;
    private Product[] basket = new Product[5];
    
    public void addProduct(Product p){
        if(id<5){
            basket[id] = p;
            id++;
        }else{
            System.out.println("basket is full");
        }
        
    }
    @Override
    public String toString(){
        String output = "";
        if(id != 0){
            for (Product product : basket) {
                output += product;
            }
        }else{
            System.out.println("Basket is empty");
        }
        return output + "\n";
    }
    public int getSum(){
        int sum = 0;
        if(id == 0){
            System.out.println("Your basket is empty");
        }else{
            for (Product product : basket) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
    public void basketListFind (String p){
        int i = 0;
        if(id != 0){
            for (Product product : basket) {
                if(product.getName().equals(p)){
                    System.out.println(product + "found in basket");
                    i++;
                }
            }
        }
        if(i == 0){
            System.out.println("in basket not found " + p);
        }
    }
    public void clear(){
        this.basket = null;
        this.basket = new Product[5];
        this.id = 0;
    }
}
