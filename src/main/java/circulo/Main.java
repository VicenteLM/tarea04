package circulo;

import java.text.DecimalFormat;

/**
 * Pruebas de refactorización en NetBeans con la clase
 * {@link circulo.Circulito Circulito}
 * @author Vicente López Mariño
 * @version 1.0
 * @see circulo.Circulito
 */
public class Main {

    /**
     * Método principal de la clase Main
     * @param args
     */
    public static void main(String[] args) {
        Circulito circulo = new Circulito(37,43,2.5);
        String salida =
                "La coordenada X es "+circulo.getCoordenadaX()+
                "\nLa coordenada Y es "+circulo.getCoordenadaX()+
                "\nEl radio es "+circulo.getRadio();
        circulo.setCoordenadaX(35);
        circulo.setCoordenadaX(20);
        circulo.establecerRadio(4.2);
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        salida+="\nEl diámetro es "+dosDigitos.format(circulo.obtenerDiametro());
        salida+="\nLa circunferencia es "+dosDigitos.format(circulo.obtenerCircunferencia());
        salida+="\nEl área es "+dosDigitos.format(circulo.obtenerAreaCirculo());
        System.out.println(salida);
    }

}
