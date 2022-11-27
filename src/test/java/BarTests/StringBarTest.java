package BarTests;

import org.junit.jupiter.api.Test;
import org.marcovb.bar.Bar;
import org.marcovb.bar.BarObserver;
import org.marcovb.bar.StringBar;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringBarTest {
    @Test
    public void happyHour() {
        Bar bar = new StringBar();
        assertFalse(bar.isHappyHour());
        bar.startHappyHour();
        assertTrue(bar.isHappyHour());
        bar.endHappyHour();
        assertFalse(bar.isHappyHour());
    }
}
