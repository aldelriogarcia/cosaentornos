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
        System.out.println("Introduce un número entre 16 y 36"
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
        
        }
        }
    }


