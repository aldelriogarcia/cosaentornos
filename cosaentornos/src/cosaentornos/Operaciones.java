package cosaentornos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ubuntu
 */
public class Operaciones {

    /**
     *Genera el numero en el que cae la ruleta.
     * 
     * @param casilleros el numero tope de casilleros en la ruleta
     * @return el numero de la ruleta
     */
    static public int AleatorioRuleta(int casilleros) {
        double aleatoria = (Math.random() * casilleros);
        return (int) aleatoria;
    }

    /**
     *General el color del numero de la ruleta.
     * 
     * @param numapuesta el numero por el que se apuesta
     * @param aleatoria  el numero previamente generado en aleatorioruleta
     * @return el color de la ruleta
     */
    static public int ColorRuleta(int numapuesta, int aleatoria) {
        int color = 0;

        if ((int) aleatoria % 2 == 0) {
            color = 1;
        } else if ((int) aleatoria % 2 != 0) {
            color = 2;
        }
        return color;
    }

    /**
     *Genera el color del numero por el que el jugador ha apostado.
     * 
     * @param numapuesta el numero por el que el jugador ha apostado
     * @return el color del jugador
     */
    static public int ColorJugador(int numapuesta) {
        int colorapuesta = 0;

        if (numapuesta % 2 == 0) {
            colorapuesta = 1;
        } else if (numapuesta % 2 != 0) {
            colorapuesta = 2;
        }
        return colorapuesta;
    }
   
    /**
     *Multiplica la ganancia por un factor y 
     *lo suma al dinero del jugador para obtener un total.
     * 
     * @param dinero el dinero que tiene el jugador
     * @param apuesta la cantidad apostada
     * @param factor la cantidad por la que se multiplica para obtener la ganancia
     * @return el dinero total del jugador
     */
    static public int TotalJugador (int dinero, int apuesta,double factor){
        int inicial = (int) (apuesta * factor);
        dinero = inicial + dinero;
        return dinero;
    }
}
