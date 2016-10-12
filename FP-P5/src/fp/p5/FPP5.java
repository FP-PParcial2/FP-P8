/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p5;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de Variables
        int a;
        a=IntroduceNumero();
        calculaprimo(a);
    }
    public static int IntroduceNumero(){
        int numero;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce Numero");
        numero=teclado.nextInt();
        return numero;
    }
    public static void calculaprimo(int a){
        Scanner calcula =new Scanner(System.in);
        int numero=calcula.nextInt();
        int numero2=numero-1;
        
        while((numero%numero2)!=0){
            numero2--;
        }if(numero2==1){
            System.out.println("Es Primo");
            
        }else{System.out.println("No es Primo");}
        
        }
    }

