package org.example.enums;

public enum Plan {
   BASIC("Basic", 100),
    PREMIUM("Premium", 250),
    VIP("Vip", 500);

   private final String name;
   private final int price;
   Plan(String name, int price) {
       this.name = name;
       this.price = price;
   }
   public String getName(){
       return name;
   }
   public int getPrice(){
       return price;
   }
}
