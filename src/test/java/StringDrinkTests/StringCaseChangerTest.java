package StringDrinkTests;

import org.junit.jupiter.api.Test;
import org.marcovb.stringdrink.StringCaseChanger;
import org.marcovb.stringdrink.StringDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCaseChangerTest {
    @Test
    public void stringCaseChanger() {
        StringDrink drink = new StringDrink("aBcD");
        StringCaseChanger cc = new StringCaseChanger();
        cc.execute(drink);
        assertEquals("AbCd", drink.getText());
    }
}
