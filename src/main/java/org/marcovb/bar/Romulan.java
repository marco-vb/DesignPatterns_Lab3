package org.marcovb.bar;

public class Romulan extends AlienClient {
    public Romulan() {
        super();
    }

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new ImpatientStrategy();
    }
}
