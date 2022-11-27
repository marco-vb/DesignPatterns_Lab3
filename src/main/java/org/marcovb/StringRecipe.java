package org.marcovb;

import java.util.List;

public class StringRecipe {
    private final List<StringTransformer> steps;

    public StringRecipe(List<StringTransformer> steps) {
        this.steps = steps;
    }

    public void mix(StringDrink drink) {
        for (StringTransformer step : steps) {
            step.execute(drink);
        }
    }
}
