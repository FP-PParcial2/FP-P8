/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p6;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        int a;
        double b;
        a=IntroduceHoras();
        b=IntroducePagaXHora();
        sueldoSemanal(a,b);
    }
    public static int IntroduceHoras(){
        int horas;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce Horas trabajadas");
        horas=teclado.nextInt();
        return horas;
    }
    public static double IntroducePagaXHora(){
        int paga;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce paga por hora");
        paga=teclado.nextInt();
        return paga;
    }
    public static void sueldoSemanal(int a , double b){
        if(a<=40){
            double r=(a*b)*7;
            System.out.println("El sueldo es " + r);
        } else if (a>40 || a<=48){
            double r=((a*b)*7)*2;
            System.out.println("El sueldo es " + r);
        } else if (a>48){
            double r=((a*b)*7)*3;
            System.out.println("El sueldo es " + r);
        }
    }
}
