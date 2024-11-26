package com.github.luizredig.desing_patterns_semestral.strategy.interfaces;

import com.github.luizredig.desing_patterns_semestral.strategy.Package;

public interface TransportStrategy {
    String calculateDelivery(Package pkg);
}
