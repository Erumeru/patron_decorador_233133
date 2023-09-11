package org.itson.patron_decorador_233133.bebidas;

/**
 *
 * @author elmer
 */
public class CondimentoDecorador extends Bebida {

    public Bebida bebida;

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double costo() {
        return costo;
    }

}
