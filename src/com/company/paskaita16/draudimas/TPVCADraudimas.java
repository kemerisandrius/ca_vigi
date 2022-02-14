package com.company.paskaita16.draudimas;

public class TPVCADraudimas extends AutomobilioDraudimas {
    private String galiojimoTeritorija;

    public TPVCADraudimas(String apdraustojoVardas, double draudimoSuma, String automobilioValstybiniaiNr,
        String galiojimoTeritorija) {
        super(apdraustojoVardas, draudimoSuma, automobilioValstybiniaiNr);
        this.galiojimoTeritorija = galiojimoTeritorija;
    }

    public String getGaliojimoTeritorija() {
        return galiojimoTeritorija;
    }
}
