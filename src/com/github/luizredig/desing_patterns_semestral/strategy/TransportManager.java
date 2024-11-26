package com.github.luizredig.desing_patterns_semestral.strategy;

import com.github.luizredig.desing_patterns_semestral.strategy.interfaces.TransportStrategy;

public class TransportManager {
    private TransportStrategy strategy;

    public TransportManager(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public String deliverPackage(Package pkg) {
        return strategy.calculateDelivery(pkg);
    }
}
