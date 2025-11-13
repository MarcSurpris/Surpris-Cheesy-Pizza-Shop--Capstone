package com.pluralsight.capstone.model;

// Veggie

import com.pluralsight.capstone.util.CrustType;
import com.pluralsight.capstone.util.PizzaSize;

public class Veggie extends Pizza {
    public Veggie() {
        super(PizzaSize.PERSONAL_8_INCH, CrustType.REGULAR);
        addTopping(new RegularTopping("Bell Peppers"));
        addTopping(new RegularTopping("Spinach"));
        addTopping(new RegularTopping("Olives"));
        addTopping(new RegularTopping("Onions"));
        addTopping(new Sauce("Marinara"));
        addTopping(new Cheese("Mozzarella"));
    }
}
