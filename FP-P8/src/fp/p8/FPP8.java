/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p8;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double a,b,r;
        a=IntroduceCateto1();
        b=IntroduceCateto2();
        r=Hipotenusa(a,b);
        mostrar(r);
       
    }
    public static float IntroduceCateto1(){ //Metodo cateto 1
        int cat1;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce Cateto 1");      
        cat1=teclado.nextInt();
        return cat1;
        
        
    }
    public static float IntroduceCateto2(){ //Metodo cateto 2
        int cat2;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce Cateto 2");
        cat2=teclado.nextInt();
        return cat2;
        
    }
    public static double Hipotenusa(double a,double b){ //Calcular Hipotenusa mediante la formula de pitagoras
        double r;
        r= Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        return r;
    }
    public static void mostrar(double r){
        System.out.println("La hipotenusa es " + r);
    }
}
