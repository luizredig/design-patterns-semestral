package com.github.luizredig.desing_patterns_semestral.strategy.transports;

import com.github.luizredig.desing_patterns_semestral.strategy.Package;
import com.github.luizredig.desing_patterns_semestral.strategy.interfaces.TransportStrategy;

public class SeaTransport implements TransportStrategy {
    @Override
    public String calculateDelivery(Package pkg) {
        if (!pkg.isInternational()) {
            return "Transporte marítimo está disponível apenas para entregas internacionais.";
        }
        return "Usando transporte marítimo para a entrega.";
    }
}
