package org.skypro.skyshop.product;

 public class Article implements Searchable{
    private String nameOfArticle;
    private String textOfArticle;

    public Article(String n,String t){
        nameOfArticle = n;
        textOfArticle = t;
    }
    public String getInfo(){
        return nameOfArticle + " - " + textOfArticle;
    }

     @Override
     public String getSearchTerm() {
         return toString();
     }

     @Override
     public String getType() {
         return "ARTICLE";
     }

     @Override
     public String getStringRepresentation() {
         return Searchable.super.getStringRepresentation();
     }
 }