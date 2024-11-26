package com.github.luizredig.desing_patterns_semestral.strategy.transports;

import com.github.luizredig.desing_patterns_semestral.strategy.Package;
import com.github.luizredig.desing_patterns_semestral.strategy.interfaces.TransportStrategy;

public class LandTransport implements TransportStrategy {
    @Override
    public String calculateDelivery(Package pkg) {
        if (pkg.getCarrier() == null || pkg.getCarrier().isEmpty()) {
            return "Transporte terrestre exige uma transportadora local. Nenhuma foi selecionada.";
        }
        return "Usando transporte terrestre com a transportadora local: " + pkg.getCarrier();
    }
}
