package StringDrinkTests;

import org.junit.jupiter.api.Test;
import org.marcovb.stringdrink.StringDrink;
import org.marcovb.stringdrink.StringReplacer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReplacerTest {
    @Test
    public void stringReplacer() {
        StringDrink drink = new StringDrink("ABCDABCD");
        StringReplacer sr = new StringReplacer('A', 'X');
        sr.execute(drink);
        assertEquals("XBCDXBCD", drink.getText());
    }
}
