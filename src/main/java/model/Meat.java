package model;

import lombok.Data;
import lombok.NoArgsConstructor;


public class Meat extends Food {

    public Meat(int amount, double price) {
        super(amount, price, false);
    }
}
