/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujarrombo;

import java.util.Scanner;

/**
 *
 * @author Koto
 */
public class DibujarRombo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, fila, columna;
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Introduce un número: ");
        num = entrada.nextInt();
        
        for (fila = 1; fila <= num; fila++){
            for (columna = num; columna >= fila; columna--){
                System.out.print(" ");
            }
            for (columna = 1; columna <= fila - 1; columna++){
                System.out.print("*");
            }
            for (columna = 1; columna <= fila; columna++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (fila = num - 1; fila >= 1; fila--){
            for (columna = num; columna >= fila; columna--){
                System.out.print(" ");
            }
            for (columna = 1; columna <= fila - 1; columna++){
                System.out.print("*");
            }
            for (columna = 1; columna <= fila; columna++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
