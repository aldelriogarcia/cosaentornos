package cosaentornos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Z
 */

public class Salidas {
    /**   
     * @param dinero el dinero que tiene el jugador
     * @param inicial el dinero que tenia el jugador al comenzar
     * @param dinerorul el dinero que tiene la ruleta
     * @param apuesta el dinero apostado
     * @param numapuesta el numero al que se apuesta
     * @param aleatoria un numero aleatorio generado por la clase operaciones
     * @param ganancia el dinero ganado
     * @param colorul color de la ruleta
     * @param colornum color del jugador
     **/
    public static void output(double aleatoria,int numapuesta,int apuesta,int ganancia,int dinero,int dinerorul,int inicial, int colorul, int colornum){
        
         System.out.println(
                "El número seleccionado por la ruleta fue: "+(int)aleatoria+"\n"+
                "Jugador-> num apostado: "+numapuesta+", Cantidad: $"+apuesta+" Ganancia: $"+ganancia+"\n"+
                "Color del jugador: "+colornum+", Color de la ruleta: "+colorul+"\n"+        
                "Dinero del jugador es: "+dinero+"\n"+
                "Dinero de  la ruleta: "+dinerorul+"\n"+
                "La cantidad límite para ganar es: "+inicial*50);    
        
    }
}
