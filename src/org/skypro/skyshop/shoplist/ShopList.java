package org.skypro.skyshop.shoplist;

import java.util.Random;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class ShopList {
    private final String[] NAME_PRODUCT = {"sofa","work table","chair","wardrobe","kitchen table","bed","magazine table"};
    public static Product[] productList = new Product[15];
        public ShopList(){
            //создание "рандомного" листа
            Random rand = new Random();
            for (int i = 0;i<productList.length;i++) {
                String n = NAME_PRODUCT[rand.nextInt(NAME_PRODUCT.length)];
                int price = rand.nextInt(15000);
                if(price<5000){
                    price = 9999;
                }
                productList[i] = new SimpleProduct(n, price);
            }
        }
        // получение продукта по id 
        public Product getProductAtList(int n){
            return productList[--n];
    }
    //создание строки с каталогом
    public String toString(){
        String output = "Shop \n";
        for (Product p : productList) {
            output += p;
        }
        return output;
    }
    //поиск товара в магазине
    public void findProduct(String name){
        for (Product pro : productList) {
            if(pro.getName().equals(name)){
                System.out.println(pro + " in shop");
            }
        }
    }
}
