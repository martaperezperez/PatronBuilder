package com.COD;

public class Pizzas {
    private int tipoMasa;
    private int tamaño;
    private boolean rellena;
    private boolean cebolla;
    private boolean sinGluten;
    private int recojida;


    public static final int FINA = 0;
    public static final int PAN = 1;


    public static final int SMALL = 0;
    public static final int MEDIUM = 2;
    public static final int BIG = 3;


    public static final int TIENDA = 0;
    public static final int PARALLEVAR = 1;

    public Pizzas(){
        this.cebolla = true;
        this.recojida = TIENDA;
        this.rellena = false;
        this.sinGluten = false;
        this.tamaño = MEDIUM;
        this.tipoMasa = FINA;
    }


    public Pizzas(int tipoMasa, int tamaño, boolean rellena, boolean cebolla, boolean sinGluten, int recojida) {
        this.tipoMasa = tipoMasa;
        this.tamaño = tamaño;
        this.rellena = rellena;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.recojida = recojida;
    }
    public int getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(int tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isRellena() {
        return rellena;
    }

    public void setRellena(boolean rellena) {
        this.rellena = rellena;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public int getRecojida() {
        return recojida;
    }

    public void setRecojida(int recojida) {
        this.recojida = recojida;
    }
}
