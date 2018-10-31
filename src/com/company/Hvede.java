package com.company;

public class Hvede extends Basis {

    String beskrivelse = "bund af hvedemel";


    public String getBeskrivelse(){

        return beskrivelse;
    }

    @Override
    public int pris() {
        return 5 ;
    }
}
