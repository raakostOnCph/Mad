package com.company;

public class Fuldkorn extends Basis {

    public String beskrivelse = "fuldkorn";

    @Override
    public String getBeskrivelse() {
        return beskrivelse;
    }

    @Override
    public int pris() {
        return 15;
    }
}
