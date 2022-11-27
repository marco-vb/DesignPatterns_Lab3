package org.marcovb.stringdrink;

public class StringReplacer implements StringTransformer {
    private final char oldChar;
    private final char newChar;

    public StringReplacer(char oldChar, char newChar) {
        this.oldChar = oldChar;
        this.newChar = newChar;
    }

    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText().replace(oldChar, newChar);
        drink.setText(text);
    }

    @Override
    public void undo(StringDrink drink) {
        String text = drink.getText().replace(newChar, oldChar);
        drink.setText(text);
    }
}
