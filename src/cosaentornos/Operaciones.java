package cosaentornos.src.cosaentornos;

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

    public int devuelveNumAleatorioDeRuleta(int casilleros) {
        double aleatoria = (Math.random() * casilleros);
        return (int) aleatoria;
    }

    public int devuelveColorRuleta(int numapuesta, int aleatoria) {
        int color = 0;

        if ((int) aleatoria % 2 == 0) {
            color = 1;
        } else if ((int) aleatoria % 2 != 0) {
            color = 2;
        }
        return color;
    }

    public int devuelveColorJugador(int numapuesta) {
        int colorapuesta = 0;

        if (numapuesta % 2 == 0) {
            colorapuesta = 1;
        } else if (numapuesta % 2 != 0) {
            colorapuesta = 2;
        }
        return colorapuesta;
    }

    public int devuelveDineroGanado (int apuesta,double factor){
        int ganancia = (int) (apuesta * factor);
        return ganancia;
    }

    public int devuelveDineroTotalJugador (int dinero, int apuesta,double factor){
        int inicial = (int) (apuesta * factor);
        dinero = inicial + dinero;
        return dinero;
    }

}
