/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimización_ag;
import java.util.*;
/**
 *
 * @author Anderson
 */
public class Optimización_AG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion =0;
        //while(opcion!=11){
        System.out.println("¿Qué función deseas optimizar con algoritmos genéticos");
        System.out.println("1: (x^2-5x+9) lg2 + lg125 = 3");
        System.out.println("2: (2+x)(lg2^2-x)+lg(1250)=4");
        System.out.println("3: (lg(2)+lg(11-(x^2)))/lg(5-x)=2");
        System.out.println("4: (x^2-4x+7)lg5+lg16 = 4");
        System.out.println("5: lg(x+sqrt(x^2-1)+lg(x-sqrt(x^2-1)=0; x>=1");
        System.out.println("6: 3 lg(x)-lg(32)=lg(x/2)");
        System.out.println("7: lg_2(x) lg_x(2x) lg_2x(y) = lg_x(x^2)");
        System.out.println("8: 5 lg(x/2)+2lg(x/3)=3lg(x)-lg(32/9)");
        System.out.println("9: 2 lg(x)=3+lg(x/10)");
        System.out.println("9: 2 lg(x)=3+lg(x/10)");
        System.out.println("10: lg(sqrt(3x+1)) - lg(sqrt(2x-3)) = 1 - lg(5)");
        System.out.println("11: Salir ");

        
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                pruebaAG1 optimizacion1 = new pruebaAG1();
                optimizacion1.empezar();
                break;
             
            case 2:
                pruebaAG2 optimizacion2 = new pruebaAG2();
                optimizacion2.empezar();
                break;
            case 3:
                pruebaAG3 optimizacion3 = new pruebaAG3();
                optimizacion3.empezar();
                break;
            case 4:
                pruebaAG4 optimizacion4 = new pruebaAG4();
                optimizacion4.empezar();
                break;
            case 5:
                pruebaAG5 optimizacion5 = new pruebaAG5();
                optimizacion5.empezar();
                break;
            case 6:
                pruebaAG6 optimizacion6 = new pruebaAG6();
                optimizacion6.empezar();
                break;
            case 7:
                pruebaAG7 optimizacion7 = new pruebaAG7();
                optimizacion7.empezar();
                break;
            case 8:
                pruebaAG8 optimizacion8 = new pruebaAG8();
                optimizacion8.empezar();
                break;
            case 9:
                pruebaAG9 optimizacion9 = new pruebaAG9();
                optimizacion9.empezar();
                break;
            case 10:
                pruebaAG_10 optimizacion10 = new pruebaAG_10();
                optimizacion10.empezar(); 
                break;
            case 11:
                break;
        }
        
      //}    
        
    }
    
}
