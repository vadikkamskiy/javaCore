package org.skypro.skyshop;

import java.util.Random;

import org.skypro.skyshop.basket.Basket;
import org.skypro.skyshop.shoplist.ShopList;

public class App {
    static Random rand = new Random();
    public static void main(String[] args) throws Exception {
        //создание "рандомного" листа с продукцией
        ShopList sl = new ShopList();
        System.out.println(sl);
        //создание корзины
        Basket myBasket = new Basket();
        System.out.println(myBasket.getList());
        /*добовление "рандомных" продуктов в корзину
        *не всегда добавляются все три разных класса
        */ 
        for(int i = 0; i< 7;i++){
            myBasket.addProduct(sl.getProductAtList(rand.nextInt(14)));

        }
        System.out.println(myBasket.getList());
        String p = "sofa";
        sl.findProduct(p);
        System.out.println("available in basket :" + myBasket.basketListFind(p));
        myBasket.clear();
        System.out.println(myBasket.getList());
        myBasket.basketListFind(p);
    }
}
