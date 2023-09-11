package org.itson.patron_decorador_233133.bebidas;

/**
 *
 * @author elmer
 */
public class Soya extends CondimentoDecorador {

    public Soya(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + "\n - soya";
    }

    @Override
    public double costo() {
        double costoConCondimento = bebida.costo() + 15.00;
        return costoConCondimento;
    }

}
