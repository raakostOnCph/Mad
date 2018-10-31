package com.company;

public class Ost extends Tilbehør {


    Basis basis;

    public Ost(Basis basis) {
        this.basis = basis;
    }

    public String getBeskrivelse() {
        return basis.getBeskrivelse() + " , mozzarella";
    }

    @Override
    public int pris() {
        return basis.pris() + 10 ;
    }
}
