package org.volaille;

public class Poulet extends Volaille {

    static Double prix_poulet = 12.0;

    public Poulet(int id) {
        super(id);
    }

    @Override
    public Double calcul_prix() {
        return null;
    }
}
