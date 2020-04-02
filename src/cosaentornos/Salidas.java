package cosaentornos.src.cosaentornos;

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
    public static void output(double aleatoria,int numapuesta,int apuesta,int ganancia,int dinero,int dinerorul,int inicial） {
        
        return System.out.println(
                 "El número seleccionado por la ruleta fue: "+(int)aleatoria+"\n"+
                "Jugador->num apostado: "+numapuesta+", Cantidad: $"+apuesta+"= ganancia: $"+ganancia+"\n"+
                "Dinero del jugador es: "+dinero+"\n"+
                "Dinero de  la ruleta: "+dinerorul+"\n"+
                "La cantidad límite para ganar es: "+inicial*50);    
        
    }
}
