package model;

import lombok.Builder;
import model.constants.Colour;

import static model.constants.Colour.RED;

@Builder
public class Apple extends Food {

    private Colour colour;

    public Apple(int amount, double price, Colour colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(RED)) {
            return 60.00;
        }

        return 0;
    }
}
