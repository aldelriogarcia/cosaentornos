/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosaentornos;

import cosaentornos.src.cosaentornos.Operaciones;
import java.util.Scanner;

/**
 *
 * @author aldel
 */
public class Cosaentornosmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número entre 16 y 36"
                + "que sea múltiplo de cuatro");
        int casilleros = input.nextInt();
        while (casilleros % 4 != 0 || casilleros < 16 || casilleros > 36) {
            System.out.println("Número no válido, introduce otro");
            casilleros = input.nextInt();
        }

        System.out.println("Introduce el la cantidad de dinero que posees");
        int dinero = input.nextInt();
        while (dinero < 0) {
            System.out.println("Eres pobre, vuelve cuando tengas pelas");
            dinero = input.nextInt();
        }
        int inicial = dinero, numapuesta, apuesta;

        while (dinero < inicial * 50 && dinero != 0 && dinero > 0) {
            int dinerorul = dinero * 100;
            System.out.println("¿Cuanto deseas apostar?");
            apuesta = input.nextInt();
            while (apuesta < 0 || apuesta > dinero) {
                System.out.println("Cantidad no válida, prueba otra vez");
                apuesta = input.nextInt();
            }
            System.out.println("¿A qué número?");
            numapuesta = input.nextInt();
            while (numapuesta < 0 || numapuesta > casilleros) {
                System.out.println("Número no válido, prueba otra vez");
                numapuesta = input.nextInt();
            }
            Operaciones operacion = new Operaciones();
            double aleatoria = operacion.devuelveNumAleatorioDeRuleta(casilleros);
            int colorapuesta = operacion.devuelveColorJugador(numapuesta);
            int color = operacion.devuelveColorRuleta(numapuesta, (int) aleatoria);

            if (numapuesta == (int) aleatoria) {
                dinero = operacion.devuelveDineroTotalJugador(dinero, apuesta, 16.0);
                int ganacia= operacion.devuelveDineroGanado(apuesta, 16.0);
            } else if (color == colorapuesta) {
                dinero = operacion.devuelveDineroTotalJugador(dinero, apuesta, 1.8);
                ganacia= operacion.devuelveDineroGanado(apuesta, 16.0);
            } else if ((color != colorapuesta) || (numapuesta != (int) aleatoria)) {
                inicial = 0;
                ganancia=0;
                dinero = dinero - apuesta;
            }

             System.out.println(
                 "El número seleccionado por la ruleta fue: "+(int)aleatoria+"\n"+
                "Jugador->num apostado: "+numapuesta+", Cantidad: $"+apuesta+"= ganancia: $"(int)ganancia+"\n"+
                "Dinero del jugador es: "+dinero+"\n"+
                "Dinero de  la ruleta: "+dinerorul+"\n"+
                "La cantidad límite para ganar es: "+inicial*50);    
        }
        if (dinero<=0){
                System.out.println("Gana la Casa");
        } else {
                System.out.println("Gana el jugador");
            } 
    }
