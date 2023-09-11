package org.itson.patron_decorador_233133.bebidas;

/**
 *
 * @author elmer
 */
public class Bebida implements IBebida {

    private IBebida Ibebida;
    String descripcion = "Bebida";
    double costo;

    public Bebida() {
    }

    public Bebida(IBebida bebida) {
        this.Ibebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double costo() {
        return costo;
    }

}
