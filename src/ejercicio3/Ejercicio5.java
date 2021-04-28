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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int n, x[], mayor, menor, suma=0,contador=0,prom;
       
        System.out.println("Cantidad de elementos:");
        n= teclado.nextInt();    
        x= new int[n];
       
        for(int i=0;i<n;i++)
        {
            System.out.println("Ingresa un numero ");
            x[i]= teclado.nextInt();
       
        }
         mayor=menor=x[0];
         for(int i=0;i<n;i++)
             if(x[i]>mayor)
                 mayor=x[i];
         else
                 if(x[i]<menor)
                     menor=x[i];
       
         for(int i=0;i<n;i++)
             suma= x[i]+suma;
        prom=suma/n;
         System.out.println("La suma es:" +suma); 
         System.out.println("El numero mayor es:" +mayor);
         System.out.println("El numero menor es:" +menor);
         System.out.println("El promedio es: "+prom);
    }
    
}
