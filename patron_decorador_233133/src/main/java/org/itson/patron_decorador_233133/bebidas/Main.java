package org.itson.patron_decorador_233133.bebidas;

/**
 *
 * @author elmer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Bebida bebida = new Expresso();
        
        System.out.println(bebida.getDescripcion() + " \n Costo:" + bebida.costo());

        Bebida bebida2 = new DarkRoast();
            bebida2 = new CremaBatida(bebida2);
            
        System.out.println(bebida2.getDescripcion() + " \n Costo:" + bebida2.costo());

        Bebida bebida3 = new Decaf();
            bebida3 = new CremaBatida(bebida3);
            bebida3 = new Leche(bebida3);
            bebida3 = new Chocolate(bebida3);
            
        System.out.println(bebida3.getDescripcion() + " \n Costo:" + bebida3.costo());

        Bebida bebida4 = new Decaf();
            bebida4 = new CremaBatida(bebida4);
            bebida4 = new Leche(bebida4);
            bebida4 = new Chocolate(bebida4);
            bebida4 = new Soya(bebida4);
            
        System.out.println(bebida4.getDescripcion() + " \n Costo:" + bebida4.costo());
    }
}
