/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p7;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de Variables
        double a;
        a= pedirKilometrosSobreHoras();
        
        mostrar(a);
       
    }
public static int pedirKilometrosSobreHoras(){
        int KilometrosXHora;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce K/H");
        KilometrosXHora=teclado.nextInt();
        return KilometrosXHora;
    }
    public static void mostrar(double a){
        double r;
        r= (a*1000)/3600;
        System.out.println(a+ " K/H " + " equivale a " + r + " M/S");
       
        
    }
    
}
