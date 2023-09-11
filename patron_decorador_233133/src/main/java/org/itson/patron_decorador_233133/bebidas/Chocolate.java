package org.itson.patron_decorador_233133.bebidas;

/**
 *
 * @author elmer
 */
public class Chocolate extends CondimentoDecorador {

    public Chocolate(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + "\n - chocolate";
    }

    @Override
    public double costo() {
        double costoConCondimento = bebida.costo() + 10.00;
        return costoConCondimento;
    }
}
