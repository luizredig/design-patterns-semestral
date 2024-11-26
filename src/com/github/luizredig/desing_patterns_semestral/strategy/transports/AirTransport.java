package com.github.luizredig.desing_patterns_semestral.strategy.transports;

import com.github.luizredig.desing_patterns_semestral.strategy.Package;
import com.github.luizredig.desing_patterns_semestral.strategy.interfaces.TransportStrategy;

public class AirTransport implements TransportStrategy {
    @Override
    public String calculateDelivery(Package pkg) {
        if (pkg.getWeight() > 50 || pkg.getDimensions() > 100) {
            return "Transporte aéreo não disponível. O pacote excede os limites de peso ou dimensões.";
        }
        return "Usando transporte aéreo para a entrega.";
    }
}
