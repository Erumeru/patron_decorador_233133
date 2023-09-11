package org.itson.patron_decorador_233133.bebidas;

/**
 *
 * @author elmer
 */
public class CremaBatida extends CondimentoDecorador {

    public CremaBatida(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + "\n - crema Batida";
    }

    @Override
    public double costo() {
        double costoConCondimento = this.bebida.costo() + 20.00;
        return costoConCondimento;
    }
}
