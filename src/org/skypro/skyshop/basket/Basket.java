package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.*;
public class Basket {
    /*
    *создание статичной корзины с продукцией
    *в задании было написано "использовать static только в main-е"
    *перепробовал многое, получилось только так...    
    */
    private static Product[] basket;
    
    //добавление продукта в корзину
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
    //сумма покупок
    public int getSumOfBasket(){
        int sum = 0;
        if(basket == null){
            System.out.println("You haven't chosen anything");
        }else{
            for (Product product : basket) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
    //поиск товара в корзине
    public void findProductInBasket(String nm){
        if(basket != null){
            for (Product product : basket) {
                if(product.getName().equals(nm)){
                    System.out.println(product + "in basket");
                }
            }
        }else{
            System.out.println("basket is empty");
        }
    }
}
