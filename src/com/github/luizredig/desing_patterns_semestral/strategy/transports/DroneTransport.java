package com.github.luizredig.desing_patterns_semestral.strategy.transports;

import com.github.luizredig.desing_patterns_semestral.strategy.Package;
import com.github.luizredig.desing_patterns_semestral.strategy.interfaces.TransportStrategy;

public class DroneTransport implements TransportStrategy {
    @Override
    public String calculateDelivery(Package pkg) {
        if (!pkg.getLocation().equalsIgnoreCase("metropolitan") || pkg.getWeight() > 5 || pkg.getDimensions() > 10) {
            return "Entrega por drones está disponível apenas para áreas metropolitanas e pacotes pequenos.";
        }
        return "Usando entrega por drones.";
    }
}
