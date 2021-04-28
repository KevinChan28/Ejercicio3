/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author USER
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador=1;
        int oper = 1;
        for (int i = 1; i <103; i++) {
            contador=contador+1;
            oper=oper*contador;
            System.out.println("El factorial es: "+oper);
        }
    }
    
}
