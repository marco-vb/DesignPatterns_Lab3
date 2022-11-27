package org.marcovb.bar;

import org.marcovb.stringdrink.StringDrink;
import org.marcovb.stringdrink.StringRecipe;

public interface Client extends BarObserver{
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
}
