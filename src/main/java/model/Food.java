package model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public abstract class Food implements Discountable {

     protected int amount;
     protected double price;
     protected boolean isVegetarian;

     public Food(int amount, double price, boolean isVegetarian) {

          this.amount = amount;
          this.price = price;
          this.isVegetarian = isVegetarian;

     }

     @Override
     public double getDiscount() {
          return 0;
     }
}
