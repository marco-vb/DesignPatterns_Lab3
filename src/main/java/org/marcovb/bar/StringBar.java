package org.marcovb.bar;

import org.marcovb.stringdrink.StringDrink;
import org.marcovb.stringdrink.StringRecipe;

public class StringBar extends Bar {
    private boolean happyHour;

    public StringBar() {
        super();
        this.happyHour = false;
    }

    public boolean isHappyHour() {
        return happyHour;
    }

    public void startHappyHour() {
        happyHour = true;
        notifyObservers();
    }

    public void endHappyHour() {
        happyHour = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
