package org.marcovb.bar;

public class StringBar extends Bar {
    private boolean happyHour;

    public StringBar() {
        super();
        this.happyHour = false;
    }

    public boolean isHappyHour() {
        return happyHour;
    }

    public void startHappyHour() {
        happyHour = true;
        notifyObservers();
    }

    public void endHappyHour() {
        happyHour = false;
        notifyObservers();
    }
}
