package com.company.paskaita16.draudimas;

public class Main {

    public static void main(String[] args) {

        Draudimas draudimasTpvca = new TPVCADraudimas("Andrius", 100, "AAA111", "Lietuva");
        Draudimas draudimasKasko = new KaskoDraudimas("Andrius", 200, "BBB222", 340);

        AutomobilioDraudimas automobilioDraudimas = new AutomobilioDraudimas("Benas", 444, "CCC333");
        if (automobilioDraudimas instanceof TPVCADraudimas) {
            TPVCADraudimas tpvcaDraudimas1 = (TPVCADraudimas) automobilioDraudimas;
        }

        AutomobilioDraudimas automobilioDraudimasIsTpvca = (AutomobilioDraudimas) draudimasTpvca;
        AutomobilioDraudimas automobilioDraudimasIsKasko = (AutomobilioDraudimas) draudimasKasko;

        KaskoDraudimas kaskoDraudimas = (KaskoDraudimas) automobilioDraudimasIsKasko;
        TPVCADraudimas tpvcaDraudimas = (TPVCADraudimas) automobilioDraudimasIsTpvca;

        System.out.println("Apdraustojo vardas: " + draudimasTpvca.getApdraustojoVardas());
        System.out.println("Automobilio numeris: " + automobilioDraudimasIsTpvca.getAutomobilioValstybiniaiNr());
        System.out.println("Galiojimo teritorija: " + tpvcaDraudimas.getGaliojimoTeritorija());

        System.out.println("Apdraustojo vardas: " + draudimasKasko.getApdraustojoVardas());
        System.out.println("Automobilio numeris: " + automobilioDraudimasIsKasko.getAutomobilioValstybiniaiNr());
        System.out.println("Francize: " + kaskoDraudimas.getFrancize());
    }
}
