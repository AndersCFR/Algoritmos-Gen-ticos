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
public class funcionApt_10 extends FitnessFunction{
    private double fitness;
    double valorY=0;
    
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
        Integer c6 = (Integer) cromosoma.getGene(5).getAllele();
        Integer c7 = (Integer) cromosoma.getGene(6).getAllele(); //decimal
        Integer c8 = (Integer) cromosoma.getGene(7).getAllele();
        Integer c9 = (Integer) cromosoma.getGene(8).getAllele();
        Integer c10 = (Integer) cromosoma.getGene(9).getAllele();
        Integer c11 = (Integer) cromosoma.getGene(10).getAllele();
        Integer c12 = (Integer) cromosoma.getGene(11).getAllele();
        Integer c13 = (Integer) cromosoma.getGene(12).getAllele();

        

        String enteraX = c2.toString() + c3.toString() + c4.toString() + c5.toString() + c6.toString();        
        String decimalX = c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString() + c12.toString() + c13.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
       
        
        Float x = (Float.parseFloat(valorX));
        
        if (c1 == 0) {
            x = x;
        }
        valorY = (100-Math.abs( (Math.log10(Math.sqrt(3*x+1))) - (Math.log10(Math.sqrt(2*x-3))) - 1 + (Math.log10(5))))-100;
        System.out.println(x +" ; "+ valorY );
        fitness = 100-( (Math.log10(Math.sqrt((3*x+1)))) - (Math.log10(Math.sqrt(2*x-3))) - 1 + (Math.log10(5)));
        //lg(sqrt(3x+1))-lg(sqrt(2x-3))=1-lg(5)
    }

    public double getY(float x) {
        double v_opt_y=0;
        v_opt_y = (100-Math.abs( (Math.log10(Math.sqrt((3*x)+1))) - (Math.log10(Math.sqrt(2*x-3))) - 1 + (Math.log10(5))))-100;
        return v_opt_y;
    }
}
