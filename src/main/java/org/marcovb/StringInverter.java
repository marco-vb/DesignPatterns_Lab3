package org.marcovb;

public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        drink.setText(sb.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
