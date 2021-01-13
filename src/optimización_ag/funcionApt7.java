/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimización_ag;

import org.jgap.IChromosome;
import org.jgap.FitnessFunction;
/**
 *
 * @author Anderson
 */
public class funcionApt7 extends FitnessFunction{
     private double fitness;
    double valorFy=0;
    
    @Override
    protected double evaluate(IChromosome cromosoma) {
        Evaluar(cromosoma);
        return fitness;//agregar comprobacion de si es 50
    }
    
    private void Evaluar(IChromosome cromosoma) {
        
        // Valor de x
        Integer c1 = (Integer) cromosoma.getGene(0).getAllele();//signo X
        Integer c2 = (Integer) cromosoma.getGene(1).getAllele(); //parte entera
        Integer c3 = (Integer) cromosoma.getGene(2).getAllele();
        Integer c4 = (Integer) cromosoma.getGene(3).getAllele();
        Integer c5 = (Integer) cromosoma.getGene(4).getAllele();
        Integer c6 = (Integer) cromosoma.getGene(5).getAllele();//decimal
        Integer c7 = (Integer) cromosoma.getGene(6).getAllele();
        Integer c8 = (Integer) cromosoma.getGene(7).getAllele();
        Integer c9 = (Integer) cromosoma.getGene(8).getAllele();
        Integer c10 = (Integer) cromosoma.getGene(9).getAllele();
        Integer c11 = (Integer) cromosoma.getGene(10).getAllele();
        Integer c12 = (Integer) cromosoma.getGene(11).getAllele();
      

        String enteraY = c2.toString() + c3.toString() + c4.toString() + c5.toString();
        String decimalY = c6.toString() + c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString() + c12.toString();
        int parte_enteraY = Integer.parseInt(enteraY, 2);
        int parte_decimalY = Integer.parseInt(decimalY, 2);
        String cadena_entera = Integer.toString(parte_enteraY);
        String cadena_decimal = Integer.toString(parte_decimalY);
        String valorY = cadena_entera + "." + cadena_decimal;
       
        
        Float y = (Float.parseFloat(valorY));
        
        if (c1 == 0) {
            y = y;
        }
        valorFy = (3-Math.abs(Math.log10(y)-(2*Math.log10(2))))-3;
        System.out.println(y +" ; "+ valorFy );
        fitness = 3-(Math.log10(y)-(2*Math.log10(2)));
        /* lg_2(x) lg_x(2x) lg_2x(y) = lg_x(x^2)
        podemos operar gracias a las propiedades de los logaritmos
        y cambios de base en los logaritmos llegando a simplificar la función
        ya que la librería math no permite logaritmos con bases no conocidas
        así llegamos:
        lg(y) = 2*lg(2) que es equivalente a la expresión incialmente planteada
        */
    }

    public double getY(float y) {
        double v_opt_y=0;
        v_opt_y = (3-Math.abs(Math.log10(y)-(2*Math.log10(2))))-3;
        return v_opt_y;
    }
}
