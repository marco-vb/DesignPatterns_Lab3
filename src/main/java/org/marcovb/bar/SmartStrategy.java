package org.marcovb.bar;

import org.marcovb.stringdrink.StringDrink;
import org.marcovb.stringdrink.StringRecipe;

import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy {
    protected class Order {
        private StringDrink drink;
        private StringRecipe recipe;
        private StringBar bar;

        public Order(StringDrink drink, StringRecipe recipe, StringBar bar) {
            this.drink = drink;
            this.recipe = recipe;
            this.bar = bar;
        }
    }
    private final List<Order> orders;

    public SmartStrategy() {
        this.orders = new ArrayList<>();
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) {
            recipe.mix(drink);
        } else {
            orders.add(new Order(drink, recipe, bar));
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for (Order order : orders) {
            if (order.bar == bar) {
                order.recipe.mix(order.drink);
            }
        }
        orders.clear();
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        // do nothing
    }
}
