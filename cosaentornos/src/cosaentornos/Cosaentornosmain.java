/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosaentornos;

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
        
     /**   
     * @param casilleros el tope de los casilleros 
     * @param dinero el dinero que tiene el jugador
     * @param inicial el dinero que tenia el jugador al comenzar
     * @param dinerorul el dinero que tiene la ruleta
     * @param apuesta el dinero apostado
     * @param numapuesta el numero al que se apuesta
     * @param aleatorio un numero aleatorio generado por la clase operaciones
     * @param colorjugador el color del numero por el que se apuesta
     * @param color el color del numero que saque la ruleta
     **/
     
        System.out.println("Introduce un número entre 16 y 36 "
                + "que sea múltiplo de cuatro");
        int casilleros = input.nextInt();
        while (casilleros%4!=0||casilleros<16||casilleros>36){
            System.out.println("Número no válido, introduce otro");
            casilleros=input.nextInt();
        }
        
        System.out.println("Introduce el la cantidad de dinero que posees");
        int dinero=input.nextInt();
        while (dinero<0){
            System.out.println("Eres pobre, vuelve cuando tengas pelas");
            dinero=input.nextInt();
        }
        
        int inicial=dinero;
        
        while(dinero<inicial*50&&dinero!=0&&dinero>0){
            
        int dinerorul=dinero*100;
        
        System.out.println("¿Cuanto deseas apostar?");     
        int apuesta=input.nextInt(); 
        
        while(apuesta<0||apuesta>dinero){
            System.out.println("Cantidad no válida, prueba otra vez");
            apuesta=input.nextInt();
        }
        
        System.out.println("¿A qué número?");   
        int numapuesta=input.nextInt();
        
        while(numapuesta<0||numapuesta>casilleros){
            System.out.println("Número no válido, prueba otra vez");
            numapuesta=input.nextInt();
        }
    
       double aleatorio= Operaciones.AleatorioRuleta(casilleros);
       int colorjugador=Operaciones.ColorJugador(numapuesta);
       int color=Operaciones.ColorRuleta(numapuesta, (int)aleatorio);
       
       int ganancia = 0;
        if (numapuesta == (int)aleatorio) {
                dinero = Operaciones.TotalJugador(dinero, apuesta, 16);
                ganancia=Operaciones.devuelveDineroGanado(apuesta, 16);
            } else if (color == colorjugador) {
                dinero = Operaciones.TotalJugador(dinero, apuesta, 1.8);
                ganancia=Operaciones.devuelveDineroGanado(apuesta, 1.8);
            } else if ((color != colorjugador) || (numapuesta != (int) aleatorio)) {
                inicial = 0;
                dinero = dinero - apuesta;
            }
        
        Salidas.output(aleatorio,numapuesta,apuesta,ganancia,dinero,dinerorul,inicial, color, colorjugador);
        }
        if (dinero<=inicial){
                System.out.println("Gana la Casa");
        } else {
                System.out.println("Gana el jugador");
            } 
        }
    }


