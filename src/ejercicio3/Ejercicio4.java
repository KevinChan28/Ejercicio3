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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int num;
        int suma=0;
        int contador=0;
        int media = 0;
        System.out.println("Ingrese un numero: ");
        num=teclado.nextInt();
        for (int i = 0; i <= num; i++) {
          suma=suma+i;
          media=suma/num;
          
        }
        System.out.println("La suma es "+suma);
        System.out.println("La media de la suma de los numeros es: "+media);
    }
    
}
