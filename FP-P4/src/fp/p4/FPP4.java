/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p4;
import java.util.*;
/**
 *
 * @author Esteban
 */
public class FPP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Declaracion de variables
        int g;
        g=introduceGrados();
        transformar(g);
    }
    public static int introduceGrados(){//Metodo para Introducir Centigrados
        int grados;
        Scanner teclado=new Scanner (System.in);
        System.out.println("Introduce los Grados");
        grados=teclado.nextInt();
        
        return grados;
        
    }
    public static void transformar(int g){//Formula para transformar de C a F
        double r = g*1.8+32;
        System.out.println(g + " grados equivale a " + r + " Ferenheit ");
        
    }
}

    