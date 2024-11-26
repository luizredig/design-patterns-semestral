package com.github.luizredig.desing_patterns_semestral.strategy;

import com.github.luizredig.desing_patterns_semestral.strategy.transports.*;

public class Main {
    public static void main(String[] args) {
        Package pkg = new Package(3, 50, false, "metropolitan", "LocalCarrierX");

        TransportManager manager = new TransportManager(new LandTransport());
        System.out.println(manager.deliverPackage(pkg));

        manager.setStrategy(new AirTransport());
        System.out.println(manager.deliverPackage(pkg));

        pkg = new Package(10, 70, true, "coastal", "SeaCarrierY");
        manager.setStrategy(new SeaTransport());
        System.out.println(manager.deliverPackage(pkg));

        pkg = new Package(4, 20, false, "metropolitan", "DroneCarrierZ");
        manager.setStrategy(new DroneTransport());
        System.out.println(manager.deliverPackage(pkg));
    }
}