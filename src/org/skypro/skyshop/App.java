package org.skypro.skyshop;

import java.util.Scanner;

import org.skypro.skyshop.basket.Basket;
import org.skypro.skyshop.shoplist.ShopList;


public class App {
    //создание листа с продукцией
    static ShopList sl = new ShopList();
    public static void main(String[] args) throws Exception {
        
        watchShop();
        
        
    }

    //запуск сканера и обработка ввода
    static void choose() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int h = Integer.parseInt(input);
        
        if(h==0){
            watchBasket();
        }else if(h>0 && h<=15){
            Basket.addProduct(sl.getProductAtList(--h));
            watchShop();
        }else if(h==777){
            searchProduct();
        }
        scan.close();
        
    }

    //отображение корзины
    static void watchBasket(){
        Basket bl = new Basket();
        System.out.println(bl);
        System.out.println("Итого : " + bl.getSumOfBasket());
    }

    //отображение листа с продукцией
    static void watchShop() {
        System.out.println(sl);
        System.out.println("0 - watch basket");
        System.out.println("777 - search by name");
        choose();
    }

    static void searchProduct(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter name of product");
        String nm = scan.nextLine();
        sl.findProduct(nm);
        Basket bl = new Basket();
        bl.findProductInBasket(nm);

    }
}
