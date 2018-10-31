package com.company;

public class Main {

    public static void main(String[] args) {

        Basis pizza = new Hvede();


        pizza = new Tomatsovs(pizza);

        pizza = new Ost(pizza);


        System.out.println(pizza.pris());

        System.out.println(((Ost) pizza).getBeskrivelse());

        Basis luxusPizza  = new Fuldkorn();

        luxusPizza = new Tomatsovs(luxusPizza);

        luxusPizza = new Ost(luxusPizza);


        System.out.println("luxusPizza" );
        System.out.println(luxusPizza.getBeskrivelse());
        System.out.println(luxusPizza.pris());


        // write your code here
    }
}
