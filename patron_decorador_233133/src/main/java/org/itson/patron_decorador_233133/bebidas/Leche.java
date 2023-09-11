package org.itson.patron_decorador_233133.bebidas;

/**
 *
 * @author elmer
 */
public class Leche extends CondimentoDecorador {

    public Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + "\n - leche";
    }

    @Override
    public double costo() {
        double costoConCondimento = bebida.costo() + 8.00;
        return costoConCondimento;
    }
}
