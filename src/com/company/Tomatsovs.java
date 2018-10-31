package com.company;

public class Tomatsovs extends Tilbehør {


    Basis basis;

    public Tomatsovs(Basis basis) {
        this.basis = basis;
    }




    public String getBeskrivelse() {
        return basis.getBeskrivelse()  + ", tomatsovs";
    }



    @Override
    public int pris() {
        return basis.pris() + 3;
    }


}
