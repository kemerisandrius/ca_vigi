package com.company.java1.paskaita18.lektuvas;

import java.util.Random;

public class Lektuvas {

    public void isskleistiVaziuokle() {
        Random random = new Random();
        int x = random.nextInt(11);
        try {
            int dalyba = 5 / x;
            if (x == 5) {
                vaziuokle();
            }
            System.out.println("OK: važiuoklė sėkmingai išskleista");
        } catch (ArithmeticException e) {
            System.out.println("ERROR: važiuoklės išskleisti nepavyko");
        } catch (LaikinaKlaida e) {
            System.out.println("Svarbumas: laikina. " + e.getPriezastis());
        } catch (SvarbiKlaida e) {
            System.out.println("Svarbumas: svarbu. " + e.getPriezastis());
        } catch (VaziuoklesIsskleidimoKlaida e) {
            System.out.println("Svarbumas: nežinomas. " + e.getPriezastis());
        } finally {
            System.out.println("INFO: lėktuvas skrenda");
        }
    }

    public void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        Random random = new Random();
        int randomNumber = random.nextInt(11);

        switch (randomNumber) {
        case 1, 2, 3 -> throw new LaikinaKlaida("Sprogo padanga");
        case 4, 5, 6 -> throw new SvarbiKlaida("Sugedo variklis");
        case 7, 8, 9 -> throw new SvarbiKlaida("Nulūžo sparnas");
        case 10 -> throw new LaikinaKlaida("Nulūžo lakūnas");
        }
    }

}
