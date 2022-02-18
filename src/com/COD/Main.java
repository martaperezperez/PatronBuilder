package com.COD;

public class Main {

    public static void main(String[] args) {
Pizzas creadaconBuilder = new BuilderPizza().build();
Pizzas sintaxisEncadenadas = new BuilderPizza()
        .setCebolla(true)
        .setTamaño(Pizzas.BIG)
        .build();

        System.out.println(creadaconBuilder.toString());
        System.out.println(sintaxisEncadenadas.toString());
    }
}
