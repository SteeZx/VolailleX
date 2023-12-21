package org.volaille;

import java.util.Scanner;

public class Canard extends Volaille {

    static Double prix_canard = 5.0;
    static int poids_abattage = 1;

    public Canard(int id, Double kg) {
        super(id, kg);

    }

    @Override
    public Double calcul_prix() {
        return prix_canard*this.kg;
    }

    @Override
    public void affecter_prix() {
        Scanner scan = new Scanner(System.in);
        System.out.println("== Quel est le prix du canard au kilo ? ==");
        prix_canard = scan.nextDouble();
        scan.close();
    }

    @Override
    public void definir_poids_abattage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("== Quel est le poids d'abattage du canard ? ==");
        poids_abattage = scan.nextInt();
        scan.close();
    }

    @Override
    public boolean abbatable() {
        return kg>=poids_abattage;
    }
}
