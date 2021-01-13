/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimización_ag;

import org.jgap.IChromosome;

/**
 *
 * @author Anderson
 */
public class mostrarIndividuos {
    
    Integer c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, 
            c11, c12, c13, c14, c15, c16, c17, c18, c19,c20 ;
    
    public float obtenerValorIndividuo_decimal(IChromosome ind){
        c1 = (Integer) ind.getGene(0).getAllele(); //x
        c2 = (Integer) ind.getGene(1).getAllele();
        c3 = (Integer) ind.getGene(2).getAllele();
        c4 = (Integer) ind.getGene(3).getAllele();
        c5 = (Integer) ind.getGene(4).getAllele();
        c6 = (Integer) ind.getGene(5).getAllele();
        c7 = (Integer) ind.getGene(6).getAllele();
        c8 = (Integer) ind.getGene(7).getAllele();
        c9 = (Integer) ind.getGene(8).getAllele();
        c10 = (Integer) ind.getGene(9).getAllele();
        c11 = (Integer) ind.getGene(10).getAllele();
        c12 = (Integer) ind.getGene(11).getAllele();
        c13 = (Integer) ind.getGene(12).getAllele();
        c14 = (Integer) ind.getGene(13).getAllele();
        c15 = (Integer) ind.getGene(14).getAllele();
        c16 = (Integer) ind.getGene(15).getAllele();
        c17 = (Integer) ind.getGene(16).getAllele();
        c18 = (Integer) ind.getGene(17).getAllele();
        c19 = (Integer) ind.getGene(18).getAllele();
        c20 = (Integer) ind.getGene(19).getAllele();
       
       
        String enteraX = c1.toString();
        String decimalX = c2.toString() + c3.toString() + c4.toString()+c5.toString()+ c6.toString() + c7.toString() 
                + c8.toString() + c9.toString() + c10.toString() + c11.toString()+ c12.toString() + c13.toString() + 
                c14.toString()+ c15.toString() + c16.toString() + c17.toString() + c18.toString() + c19.toString() ;
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
      
        
        Float x = (Float.parseFloat(valorX));
        return  x;
    }
    
    public void mostrarIndividuo_decimal(IChromosome ind) {
        c1 = (Integer) ind.getGene(0).getAllele(); //x
        c2 = (Integer) ind.getGene(1).getAllele();
        c3 = (Integer) ind.getGene(2).getAllele();
        c4 = (Integer) ind.getGene(3).getAllele();
        c5 = (Integer) ind.getGene(4).getAllele();
        c6 = (Integer) ind.getGene(5).getAllele();
        c7 = (Integer) ind.getGene(6).getAllele();
        c8 = (Integer) ind.getGene(7).getAllele();
        c9 = (Integer) ind.getGene(8).getAllele();
        c10 = (Integer) ind.getGene(9).getAllele();
        c11 = (Integer) ind.getGene(10).getAllele();
        c12 = (Integer) ind.getGene(11).getAllele();
        c13 = (Integer) ind.getGene(12).getAllele();
        c14 = (Integer) ind.getGene(13).getAllele();
        c15 = (Integer) ind.getGene(14).getAllele();
        c16 = (Integer) ind.getGene(15).getAllele();
        c17 = (Integer) ind.getGene(16).getAllele();
        c18 = (Integer) ind.getGene(17).getAllele();
        c19 = (Integer) ind.getGene(18).getAllele();
        c20 = (Integer) ind.getGene(19).getAllele(); 
        
            String enteraX = c1.toString();
        String decimalX = c2.toString() + c3.toString() + c4.toString()+c5.toString()+ c6.toString() + c7.toString() 
                + c8.toString() + c9.toString() + c10.toString() + c11.toString()+ c12.toString() + c13.toString() + 
                c14.toString()+ c15.toString() + c16.toString() + c17.toString() + c18.toString() + c19.toString() ;
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
      
        
        Float x = (Float.parseFloat(valorX));
    
        System.out.println(x);
        System.out.println("");
    }
    
    
    public float obtenerValorIndividuo_3bits(IChromosome ind){
        c1 = (Integer) ind.getGene(0).getAllele(); //x
        c2 = (Integer) ind.getGene(1).getAllele();
        c3 = (Integer) ind.getGene(2).getAllele();
        c4 = (Integer) ind.getGene(3).getAllele();
        c5 = (Integer) ind.getGene(4).getAllele();
        c6 = (Integer) ind.getGene(5).getAllele();
        c7 = (Integer) ind.getGene(6).getAllele();
        c8 = (Integer) ind.getGene(7).getAllele();
        c9 = (Integer) ind.getGene(8).getAllele();
        c10 = (Integer) ind.getGene(9).getAllele();
        c11 = (Integer) ind.getGene(10).getAllele(); 
       
        String enteraX = c2.toString() + c3.toString() + c4.toString();
        String decimalX = c5.toString()+ c6.toString() + c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
               
        Float valorXfloat = (Float.parseFloat(valorX));
    
        if (c1 == 0) {
            valorXfloat = -valorXfloat;
        }
        return  valorXfloat;
    }
    
    public float obtenerValorIndividuo_4bits(IChromosome ind){
        c1 = (Integer) ind.getGene(0).getAllele(); //x
        c2 = (Integer) ind.getGene(1).getAllele();
        c3 = (Integer) ind.getGene(2).getAllele();
        c4 = (Integer) ind.getGene(3).getAllele();
        c5 = (Integer) ind.getGene(4).getAllele();
        c6 = (Integer) ind.getGene(5).getAllele();
        c7 = (Integer) ind.getGene(6).getAllele();
        c8 = (Integer) ind.getGene(7).getAllele();
        c9 = (Integer) ind.getGene(8).getAllele();
        c10 = (Integer) ind.getGene(9).getAllele();
        c11 = (Integer) ind.getGene(10).getAllele();
        c12 = (Integer) ind.getGene(11).getAllele(); 
        
       
        String enteraX = c2.toString() + c3.toString() + c4.toString() + c5.toString();
        String decimalX = c6.toString() + c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString() + c12.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
               
        Float valorXfloat = (Float.parseFloat(valorX));
    
         String signoX;
        if (c1 == 0) {
            valorXfloat = -valorXfloat;
        }
        return  valorXfloat;
    }

    public float obtenerValorIndividuo_4bits_positivos(IChromosome ind){
        c1 = (Integer) ind.getGene(0).getAllele(); //x
        c2 = (Integer) ind.getGene(1).getAllele();
        c3 = (Integer) ind.getGene(2).getAllele();
        c4 = (Integer) ind.getGene(3).getAllele();
        c5 = (Integer) ind.getGene(4).getAllele();
        c6 = (Integer) ind.getGene(5).getAllele();
        c7 = (Integer) ind.getGene(6).getAllele();
        c8 = (Integer) ind.getGene(7).getAllele();
        c9 = (Integer) ind.getGene(8).getAllele();
        c10 = (Integer) ind.getGene(9).getAllele();
        c11 = (Integer) ind.getGene(10).getAllele();
        c12 = (Integer) ind.getGene(11).getAllele(); 
        
       
        String enteraX = c2.toString() + c3.toString() + c4.toString() + c5.toString();
        String decimalX = c6.toString() + c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString() + c12.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
               
        Float valorXfloat = (Float.parseFloat(valorX));
    
         String signoX;
        if (c1 == 0) {
            valorXfloat = valorXfloat;
        }
        return  valorXfloat;
    }
    
    public float obtenerValorIndividuo_5bits(IChromosome ind){
        c1 = (Integer) ind.getGene(0).getAllele(); //x
        c2 = (Integer) ind.getGene(1).getAllele();
        c3 = (Integer) ind.getGene(2).getAllele();
        c4 = (Integer) ind.getGene(3).getAllele();
        c5 = (Integer) ind.getGene(4).getAllele();
        c6 = (Integer) ind.getGene(5).getAllele();
        c7 = (Integer) ind.getGene(6).getAllele();
        c8 = (Integer) ind.getGene(7).getAllele();
        c9 = (Integer) ind.getGene(8).getAllele();
        c10 = (Integer) ind.getGene(9).getAllele();
        c11 = (Integer) ind.getGene(10).getAllele();
        c12 = (Integer) ind.getGene(11).getAllele(); 
        c13 = (Integer) ind.getGene(12).getAllele(); 
       
        String enteraX = c2.toString() + c3.toString() + c4.toString() + c5.toString()+ c6.toString();
        String decimalX = c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString() + c12.toString() + c13.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
               
        Float valorXfloat = (Float.parseFloat(valorX));
    
         String signoX;
        if (c1 == 0) {
            valorXfloat = valorXfloat;
        }
        return  valorXfloat;
    }
    
    public void mostrarIndividuo_4bits(IChromosome ind) {
        c1 = (Integer) ind.getGene(0).getAllele(); //x
        c2 = (Integer) ind.getGene(1).getAllele();
        c3 = (Integer) ind.getGene(2).getAllele();
        c4 = (Integer) ind.getGene(3).getAllele();
        c5 = (Integer) ind.getGene(4).getAllele();
        c6 = (Integer) ind.getGene(5).getAllele();
        c7 = (Integer) ind.getGene(6).getAllele();
        c8 = (Integer) ind.getGene(7).getAllele();
        c9 = (Integer) ind.getGene(8).getAllele();
        c10 = (Integer) ind.getGene(9).getAllele();
        c11 = (Integer) ind.getGene(10).getAllele();
        c12 = (Integer) ind.getGene(11).getAllele(); 
        
        String signoX;
        if (c1 == 0) {
            signoX = "-";
        } else {
            signoX = "";
        }
       
        String enteraX = c2.toString() + c3.toString() + c4.toString() + c5.toString();
        String decimalX = c6.toString() + c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString() + c12.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
       
        
        
        Float valorXfloat = (Float.parseFloat(valorX));
    
        System.out.println(signoX + valorXfloat );
        System.out.println("");
    }
    
    public void mostrarIndividuo_4bits_positivos(IChromosome ind) {
        c1 = (Integer) ind.getGene(0).getAllele(); //x
        c2 = (Integer) ind.getGene(1).getAllele();
        c3 = (Integer) ind.getGene(2).getAllele();
        c4 = (Integer) ind.getGene(3).getAllele();
        c5 = (Integer) ind.getGene(4).getAllele();
        c6 = (Integer) ind.getGene(5).getAllele();
        c7 = (Integer) ind.getGene(6).getAllele();
        c8 = (Integer) ind.getGene(7).getAllele();
        c9 = (Integer) ind.getGene(8).getAllele();
        c10 = (Integer) ind.getGene(9).getAllele();
        c11 = (Integer) ind.getGene(10).getAllele();
        c12 = (Integer) ind.getGene(11).getAllele(); 
        
        String signoX;
        if (c1 == 0) {
            signoX = "";
        } else {
            signoX = "";
        }
       
        String enteraX = c2.toString() + c3.toString() + c4.toString() + c5.toString();
        String decimalX = c6.toString() + c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString() + c12.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
       
        
        
        Float valorXfloat = (Float.parseFloat(valorX));
    
        System.out.println(signoX + valorXfloat );
        System.out.println("");
    }


    public void mostrarTodosIndividuos_4bits(IChromosome[] ind) {

        for (IChromosome iChromosome : ind) {
            c1 = (Integer) iChromosome.getGene(0).getAllele();
            c2 = (Integer) iChromosome.getGene(1).getAllele();
            c3 = (Integer) iChromosome.getGene(2).getAllele();
            c4 = (Integer) iChromosome.getGene(3).getAllele();
            c5 = (Integer) iChromosome.getGene(4).getAllele();
            c6 = (Integer) iChromosome.getGene(5).getAllele();
            c7 = (Integer) iChromosome.getGene(6).getAllele();
            c8 = (Integer) iChromosome.getGene(7).getAllele();
            c9 = (Integer) iChromosome.getGene(8).getAllele();
            c10 = (Integer) iChromosome.getGene(9).getAllele();
            c11 = (Integer) iChromosome.getGene(10).getAllele();
            c12 = (Integer) iChromosome.getGene(11).getAllele();
            
            

            String signoX;
            if (c1 == 0) {
                signoX = "-";
            } else {
                signoX = "";
            }
          
        String enteraX = c2.toString() + c3.toString() + c4.toString() + c5.toString();
        String decimalX = c6.toString() + c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString() + c12.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
        
        
        Float valorXfloat = (Float.parseFloat(valorX));
        System.out.println(signoX + valorXfloat);
        System.out.println("");

        }
    }
     
    public void mostrarIndividuo_3bits(IChromosome ind) {
        c1 = (Integer) ind.getGene(0).getAllele(); //x
        c2 = (Integer) ind.getGene(1).getAllele();
        c3 = (Integer) ind.getGene(2).getAllele();
        c4 = (Integer) ind.getGene(3).getAllele();
        c5 = (Integer) ind.getGene(4).getAllele();
        c6 = (Integer) ind.getGene(5).getAllele();
        c7 = (Integer) ind.getGene(6).getAllele();
        c8 = (Integer) ind.getGene(7).getAllele();
        c9 = (Integer) ind.getGene(8).getAllele();
        c10 = (Integer) ind.getGene(9).getAllele();
        c11 = (Integer) ind.getGene(10).getAllele();
        
        
        
        
        String signoX;
        if (c1 == 0) {
            signoX = "-";
        } else {
            signoX = "";
        }
    
        String enteraX = c2.toString() + c3.toString() + c4.toString();
        String decimalX = c5.toString()+ c6.toString() + c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
        
        
        
        Float valorXfloat = (Float.parseFloat(valorX));
        
        System.out.println(signoX + valorXfloat + " ; ");
        System.out.println("");
    }
    

    public void mostrarTodosIndividuos_3bits(IChromosome[] ind) {

        for (IChromosome iChromosome : ind) {
            c1 = (Integer) iChromosome.getGene(0).getAllele();
            c2 = (Integer) iChromosome.getGene(1).getAllele();
            c3 = (Integer) iChromosome.getGene(2).getAllele();
            c4 = (Integer) iChromosome.getGene(3).getAllele();
            c5 = (Integer) iChromosome.getGene(4).getAllele();
            c6 = (Integer) iChromosome.getGene(5).getAllele();
            c7 = (Integer) iChromosome.getGene(6).getAllele();
            c8 = (Integer) iChromosome.getGene(7).getAllele();
            c9 = (Integer) iChromosome.getGene(8).getAllele();
            c10 = (Integer) iChromosome.getGene(9).getAllele();
            c11 = (Integer) iChromosome.getGene(10).getAllele();

            String signoX;
            if (c1 == 0) {
                signoX = "-";
            } else {
                signoX = "";
            }
      
       String enteraX = c2.toString() + c3.toString() + c4.toString();
        String decimalX = c5.toString()+ c6.toString() + c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
        

        Float valorXfloat = (Float.parseFloat(valorX));
        System.out.println(signoX + valorXfloat);
        System.out.println("");

        }
    }
    
    
    public void mostrarIndividuo_5bits(IChromosome ind) {
        c1 = (Integer) ind.getGene(0).getAllele(); //x
        c2 = (Integer) ind.getGene(1).getAllele();
        c3 = (Integer) ind.getGene(2).getAllele();
        c4 = (Integer) ind.getGene(3).getAllele();
        c5 = (Integer) ind.getGene(4).getAllele();
        c6 = (Integer) ind.getGene(5).getAllele();
        c7 = (Integer) ind.getGene(6).getAllele(); //decimañ
        c8 = (Integer) ind.getGene(7).getAllele();
        c9 = (Integer) ind.getGene(8).getAllele();
        c10 = (Integer) ind.getGene(9).getAllele();
        c11 = (Integer) ind.getGene(10).getAllele();
        c12 = (Integer) ind.getGene(11).getAllele();
        c13 = (Integer) ind.getGene(12).getAllele();
        
            
        String enteraX = c2.toString() + c3.toString() + c4.toString() + c5.toString()+ c6.toString();
        String decimalX = c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString() + c12.toString() + c13.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
        
        Float valorXfloat = (Float.parseFloat(valorX));
        
        System.out.println( valorXfloat + " ; ");
        System.out.println("");
    }
    public void mostrarTodosIndividuos_5bits(IChromosome[] ind) {

        for (IChromosome iChromosome : ind) {
            c1 = (Integer) iChromosome.getGene(0).getAllele();
            c2 = (Integer) iChromosome.getGene(1).getAllele();
            c3 = (Integer) iChromosome.getGene(2).getAllele();
            c4 = (Integer) iChromosome.getGene(3).getAllele();
            c5 = (Integer) iChromosome.getGene(4).getAllele();
            c6 = (Integer) iChromosome.getGene(5).getAllele();
            c7 = (Integer) iChromosome.getGene(6).getAllele();
            c8 = (Integer) iChromosome.getGene(7).getAllele();
            c9 = (Integer) iChromosome.getGene(8).getAllele();
            c10 = (Integer) iChromosome.getGene(9).getAllele();
            c11 = (Integer) iChromosome.getGene(10).getAllele();
            c12 = (Integer) iChromosome.getGene(11).getAllele();
            c13 = (Integer) iChromosome.getGene(12).getAllele();
        
        
        String signoX;
        if (c1 == 0) {
            signoX = "";
        } else {
            signoX = "";
        } //solo positivos
    
        String enteraX = c2.toString() + c3.toString() + c4.toString() + c5.toString()+ c6.toString();
        String decimalX = c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString() + c12.toString() + c13.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
         Float valorXfloat = (Float.parseFloat(valorX));
        System.out.println(signoX + valorXfloat);
        System.out.println("");
        }
    }
}
