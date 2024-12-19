package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.*;
public class Basket {
    private static Product[] basket;
    
    
    public static void addProduct(Product p){
        if(basket == null ){
            basket = new Product[1];
            basket[0] = p;
        }else{
            Product[] newBasket = new Product[basket.length+1];
            for (int i = 0;i < basket.length;i++) {
                newBasket[i] = basket[i];
            }
            newBasket[newBasket.length-1] = p;
            basket = newBasket;
        }
    }
    public String toString(){

        String output = "Basket \n";
        if(basket==null){
            output = "Basket is empty";
        }else{
            for (Product product : basket) {
                output += product;
            }
        }
        return output;
    }
    public void getSum(){
        int sum = 0;
        if(basket == null){
            System.out.println("You haven't chosen anything");
        }else{
            for (Product product : basket) {
                sum += product.getPrice();
            }
            System.out.println(sum);
        }
    }
}
