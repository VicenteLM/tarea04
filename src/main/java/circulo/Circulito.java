package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulito
 * @author Vicente López Mariño
 * @version 1.0
 */

public class Circulito {
    /**
     * coordenada Y de tipo entero
     */
    private int coordenadaY;
    /**
     * coordenada X de tipo entero
     */
    private int coordenadaX;
    /**
     * valor de radio de tipo double
     */
    private double radio;

    /**
     * Constructor de la clase Circulito que asisgna los valores a las 
     * coordenadas X,Y y al radio
     * @param valorX valor de coordenada X
     * @param valorY valor de coordenada Y
     * @param valorRadio valor del radio
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        establecerRadio(valorRadio);
    }
    /**
     * Método que modifica el valor del radio
     * @param valorRadio
     */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < LIMITERADIO ? LIMITERADIO : valorRadio);
    }
    private static final double LIMITERADIO = 0.0;

    /**
     * Método para el cálculo del diametro a partir del radio
     * @return valor del diametro
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Método para el cálculo del diametro 
     * @return valor de la circunferencia
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Método para el cálculo de la area de un circulo
     * @return valor area circulo
     */
    public double obtenerAreaCirculo() {
        return Math.PI * radio * radio;
    }

    /**
     * Método que devuelve una cadena de texxto con el valor de X, Y y del radio.
     * @return una cadena de texto
     */
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     * Método que desplaza 5 el valor de la coordenada X y cordenada Y
     * @param transladarX valor de coordenadaX
     * @param transladarY valor de coordendadaY
     */
    public void trasladarCentro(int transladarX, int transladarY){
        coordenadaX=coordenadaX + 5;
        coordenadaY=coordenadaY + 5;
    }

    /**
     * Método para obtener el valor de coordenada X
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Método para modificar el valor de coordenada X
     * @param coordenadaX valor de coordenada X
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Método para obtener el valor de coordenada Y
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Método para modificar el valor de coordenada Y
     * @param coordenadaY valor de coordenada Y
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Método para obtener el valor del radio
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }
}
