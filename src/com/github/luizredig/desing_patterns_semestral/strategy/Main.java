package com.github.luizredig.desing_patterns_semestral.strategy;

import com.github.luizredig.desing_patterns_semestral.strategy.interfaces.TransportStrategy;

public class Main {
    public static void main(String[] args) {
        /* Criando pacotes */
        Package pkg1 = new Package(5, 8, false, "metropolitan", "CarrierX");
        Package pkg2 = new Package(30, 80, false, "urban", "CarrierY");
        Package pkg3 = new Package(200, 250, true, "coastal", null);
        Package pkg4 = new Package(50, 50, false, "urban", "CarrierZ");

        /* Selecionando dinamicamente o tipo de transporte com base nas
            características da encomenda e na localização do cliente. */
        try {
            TransportStrategy transport1 = TransportFactory.chooseTransport(pkg1);
            System.out.println(transport1.calculateDelivery(pkg1));

            TransportStrategy transport2 = TransportFactory.chooseTransport(pkg2);
            System.out.println(transport2.calculateDelivery(pkg2));

            TransportStrategy transport3 = TransportFactory.chooseTransport(pkg3);
            System.out.println(transport3.calculateDelivery(pkg3));

            TransportStrategy transport4 = TransportFactory.chooseTransport(pkg4);
            System.out.println(transport4.calculateDelivery(pkg4));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
