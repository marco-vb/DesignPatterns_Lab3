package org.marcovb.bar;

public class Ferengi extends AlienClient {
    public Ferengi() {
        super();
    }

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }
}
