package com.github.luizredig.desing_patterns_semestral.strategy;

import com.github.luizredig.desing_patterns_semestral.strategy.interfaces.TransportStrategy;
import com.github.luizredig.desing_patterns_semestral.strategy.transports.*;

public class TransportFactory {
    public static TransportStrategy chooseTransport(Package pkg) {
        if (pkg.getLocation().equalsIgnoreCase("metropolitan") &&
                pkg.getDimensions() <= 10 && pkg.getWeight() <= 5) {
            return new DroneTransport();
        }

        if (pkg.isInternational()) {
            return new SeaTransport();
        }

        if (pkg.getWeight() <= 100 && pkg.getDimensions() <= 200) {
            return new AirTransport();
        }

        if (!pkg.isInternational()) {
            return new LandTransport();
        }

        throw new IllegalArgumentException("O pacote não se enquadra em nenhum tipo de envio.");
    }
}

