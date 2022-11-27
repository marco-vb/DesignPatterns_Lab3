package org.marcovb.bar;

import org.marcovb.stringdrink.StringDrink;
import org.marcovb.stringdrink.StringRecipe;

public class ImpatientStrategy implements OrderingStrategy {
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        recipe.mix(drink);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        // do nothing
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        // do nothing
    }
}
