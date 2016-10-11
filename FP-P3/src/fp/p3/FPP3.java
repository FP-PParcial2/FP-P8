/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p3;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        n=introduceNumero();
        Resolver(n);
    }
        public static int introduceNumero () {
            int numero;
            Scanner teclado=new Scanner (System.in);
            System.out.println("Introduce Numero mayor a 0");
            numero=teclado.nextInt();
            
            return numero;
            }
        public static void Resolver(int n){
            int factorial=1;
            while(n!=0){
                factorial*=n;
                n --;
              
            }
            System.out.println("El factorial es " + factorial);
            
        }
}
