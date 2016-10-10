/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p2;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double b = 0,c = 0,d = 0;
        int a;
        a=Datos();
        Calcular(a,b,c,d);
       
        
    }
    
    public static int Datos() {
        int a;
        Scanner Teclado=new Scanner(System.in);
        System.out.println("Introduce medida en Metros");
        a=Teclado.nextInt();
        
        return a;
            
    }
    public static void Calcular(int a,double b ,double c,double d){
        final double yrd = 1.09361; 
        final double ft = 3.28084;
        final double mil = 0.000621371;
      
        b=(double) (a*yrd);
        c=(double) (a*ft);
        d=(double) (a*mil);
        
        
        System.out.println(a+ " es igual a " + b + " Yardas");
         System.out.println(a+ " es igual a " + c + " Pies");
          System.out.println(a+ " es igual a " + d + " Millas");
   
        
    }
  
    
    
        
        
    
        
    }
    

