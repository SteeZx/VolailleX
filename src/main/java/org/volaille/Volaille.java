package org.volaille;

import java.util.Scanner;

abstract public class Volaille {

    Double kg;
    int id;

    public Volaille(int id, Double kg) {
        this.id = id;
        this.kg = kg;
    }

    abstract public Double calcul_prix();

    abstract public void affecter_prix();

    abstract public void definir_poids_abattage();

}
