/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int num;
        int contador=1;
        int oper=1;
        System.out.println("Ingrese un numero: ");
        num=teclado.nextInt();
        for (int i = 1; i < num; i++) {
            contador=contador+1;
            oper=oper*contador;
            
        }
        System.out.println("El factorial es: "+oper);
    }
    
}
