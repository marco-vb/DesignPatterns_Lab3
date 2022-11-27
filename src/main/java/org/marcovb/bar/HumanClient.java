package org.marcovb.bar;

import org.marcovb.stringdrink.StringDrink;
import org.marcovb.stringdrink.StringRecipe;

public class HumanClient implements Client {
    private StringDrink drink;
    private StringRecipe recipe;

    public HumanClient(StringDrink drink, StringRecipe recipe) {
        this.drink = drink;
        this.recipe = recipe;
    }

    public StringDrink getDrink() {
        return drink;
    }

    public StringRecipe getRecipe() {
        return recipe;
    }

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.drink = drink;
        this.recipe = recipe;
        bar.addObserver(this);
    }

    public void happyHourStarted(Bar bar) {
        recipe.mix(drink);
    }

    public void happyHourEnded(Bar bar) {
        recipe.mix(drink);
    }
}
