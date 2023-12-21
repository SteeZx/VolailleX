package org.volaille;

import java.util.Scanner;

public class Poulet extends Volaille {

    static Double prix_poulet = 12.0;
    static int poids_abattage = 2;
    public Poulet(int id, Double kg) {
        super(id, kg);
    }

    @Override
    public Double calcul_prix() {
        return prix_poulet*this.kg;
    }

    @Override
    public void affecter_prix() {
        Scanner scan = new Scanner(System.in);
        System.out.println("== Quel est le prix du poulet au kilo ? ==");
        prix_poulet = scan.nextDouble();
        scan.close();
    }

    @Override
    public void definir_poids_abattage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("== Quel est le poids d'abattage du poulet ? ==");
        poids_abattage = scan.nextInt();
        scan.close();
    }
}
