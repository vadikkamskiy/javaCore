package org.skypro.skyshop;

import org.skypro.skyshop.basket.Basket;
import org.skypro.skyshop.shoplist.ShopList;

public class App {
    public static void main(String[] args) throws Exception {
        //создание листа с продукцией
        ShopList sl = new ShopList();
        //создание корзины
        Basket myBasket = new Basket();
        System.out.println(myBasket.toString() + myBasket.getSum());
        myBasket.addProduct(sl.getProductAtList(7));
        myBasket.addProduct(sl.getProductAtList(11));
        myBasket.addProduct(sl.getProductAtList(1));
        myBasket.addProduct(sl.getProductAtList(2));
        myBasket.addProduct(sl.getProductAtList(3));
        myBasket.addProduct(sl.getProductAtList(4));
        myBasket.addProduct(sl.getProductAtList(8));
        System.out.println(myBasket.toString() + "total : " + myBasket.getSum());
        String p = "sofa";
        sl.findProduct(p);
        myBasket.basketListFind(p);
        myBasket.clear();
        System.out.println(myBasket.toString());
        System.out.println(myBasket.getSum());
        myBasket.basketListFind(p);
    }

        
}
