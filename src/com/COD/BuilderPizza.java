package com.COD;

public class BuilderPizza {

    protected Pizzas _pizza;

    public Pizzas build() {
        return this._pizza;
    }

    public  BuilderPizza() {
        _pizza = new Pizzas();
    }

    public BuilderPizza setTipoMasa(int tipoMasa){
        _pizza.setTipoMasa(tipoMasa);
        return this;
    }
   public BuilderPizza setTamaño(int Tamaño){
        _pizza.setTamaño();
        return this;
   }
    public BuilderPizza setRelleno(boolean relleno) {
        _pizza.setRellena(relleno);
        return this;
    }

    public BuilderPizza setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuilderPizza setSinGluten(boolean sinGluten){
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    public BuilderPizza setRecojida(int recojida) {
        _pizza.setRecojida(recojida);
        return this;
    }
}
