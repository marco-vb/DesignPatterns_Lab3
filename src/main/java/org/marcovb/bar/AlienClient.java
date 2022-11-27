package org.marcovb.bar;

import org.marcovb.stringdrink.StringDrink;
import org.marcovb.stringdrink.StringRecipe;

public abstract class AlienClient implements Client {
    private final OrderingStrategy strategy;

    public AlienClient() {
        this.strategy = createOrderingStrategy();
    }

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }

    public void happyHourStarted(Bar bar) {
        strategy.happyHourStarted((StringBar) bar);
    }

    public void happyHourEnded(Bar bar) {
        strategy.happyHourEnded((StringBar) bar);
    }

    protected abstract OrderingStrategy createOrderingStrategy();
}
