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
    
    public String getList(){
        System.out.println("Basket.getList()");
        String output = "";
        if(id != 0){
            for (Product product : basket) {
                output += product.getInfo();
            }
        }else{
            System.out.println("Basket is empty");
        }
        return output + "\n Total : " + getSum();
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
    public boolean basketListFind (String p){
        System.out.println("Basket.basketListFind()");
        boolean i = false;
        if(id != 0){
            for (Product product : basket) {
                if(product.getName().equals(p)){
                    i = true;
                }
            }
        }
        return i;
    }
    public void clear(){
        System.out.println("Basket.clear()");
        this.basket = null;
        this.basket = new Product[5];
        this.id = 0;
    }
}
