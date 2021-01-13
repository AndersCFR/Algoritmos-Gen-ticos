/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimización_ag;
import org.jgap.FitnessFunction;
import org.jgap.IChromosome;
/**
 *
 * @author Anderson
 */
public class funcionApt2 extends FitnessFunction{
    private double fitness;
    
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
        Integer c5 = (Integer) cromosoma.getGene(4).getAllele(); //decimal
        Integer c6 = (Integer) cromosoma.getGene(5).getAllele();
        Integer c7 = (Integer) cromosoma.getGene(6).getAllele();
        Integer c8 = (Integer) cromosoma.getGene(7).getAllele();
        Integer c9 = (Integer) cromosoma.getGene(8).getAllele();
        Integer c10 = (Integer) cromosoma.getGene(9).getAllele();
        Integer c11 = (Integer) cromosoma.getGene(10).getAllele();
       
      

        

        String enteraX = c2.toString() + c3.toString() + c4.toString();
        String decimalX = c5.toString()+ c6.toString() + c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
       
        
        
        Float x = (Float.parseFloat(valorX));
        if (c1 == 0) {
            x = -x;
        }
    
        System.out.println(x);
        //fitness = 256 - Math.abs(valor - 50);
        fitness = 148293 - ((((2+x)*(Math.pow(Math.log10(2),(2-x))))+Math.log10(1250)-4));
        //(2+x)(lg2^2-x)+lg(1250)=4
    }
    
     public double getY(float x) {
        double v_opt_y=0;
        v_opt_y = (148293 - Math.abs((((2+x)*(Math.pow(Math.log10(2),(2-x))))+Math.log10(1250)-4))) - 148293;
        return v_opt_y;
    }
}


/*
 // Valor de x
        Integer c1 = (Integer) cromosoma.getGene(0).getAllele();//signo X
        Integer c2 = (Integer) cromosoma.getGene(1).getAllele(); //parte entera
        Integer c3 = (Integer) cromosoma.getGene(2).getAllele();
        Integer c4 = (Integer) cromosoma.getGene(3).getAllele();
        Integer c5 = (Integer) cromosoma.getGene(4).getAllele(); //decimal
        Integer c6 = (Integer) cromosoma.getGene(5).getAllele();
        Integer c7 = (Integer) cromosoma.getGene(6).getAllele();
        Integer c8 = (Integer) cromosoma.getGene(7).getAllele();
        Integer c9 = (Integer) cromosoma.getGene(8).getAllele();
        Integer c10 = (Integer) cromosoma.getGene(9).getAllele();
        Integer c11 = (Integer) cromosoma.getGene(10).getAllele();
        
      
        //Valor de y
        Integer c12 = (Integer) cromosoma.getGene(11).getAllele(); //signo y
        Integer c13 = (Integer) cromosoma.getGene(12).getAllele(); //parte entera
        Integer c14 = (Integer) cromosoma.getGene(13).getAllele();
        Integer c15 = (Integer) cromosoma.getGene(14).getAllele();
        Integer c16 = (Integer) cromosoma.getGene(15).getAllele();//decimal
        Integer c17 = (Integer) cromosoma.getGene(16).getAllele(); 
        Integer c18 = (Integer) cromosoma.getGene(17).getAllele();
        Integer c19 = (Integer) cromosoma.getGene(18).getAllele();
        Integer c20 = (Integer) cromosoma.getGene(19).getAllele();
        Integer c21 = (Integer) cromosoma.getGene(20).getAllele();
        Integer c22 = (Integer) cromosoma.getGene(21).getAllele();
      

        

        String enteraX = c2.toString() + c3.toString() + c4.toString();
        String decimalX = c5.toString()+ c6.toString() + c7.toString() + c8.toString() + c9.toString() + c10.toString() + c11.toString();
        int parte_enteraX = Integer.parseInt(enteraX, 2);
        int parte_decimalX = Integer.parseInt(decimalX, 2);
        String cadena_entera = Integer.toString(parte_enteraX);
        String cadena_decimal = Integer.toString(parte_decimalX);
        String valorX = cadena_entera + "." + cadena_decimal;
        
        String enteraY = c13.toString()+ c14.toString() + c15.toString();
        String decimalY = c16.toString() + c17.toString()+c18.toString() + c19.toString() + c20.toString() + c21.toString() + c22.toString();
        int parte_enteraY = Integer.parseInt(enteraY, 2);
        int parte_decimalY = Integer.parseInt(decimalY, 2);
        String cadena_enteraY = Integer.toString(parte_enteraY);
        String cadena_decimalY = Integer.toString(parte_decimalY);
        String valorY = cadena_enteraY + "." + cadena_decimalY;
        
        
        Float x = (Float.parseFloat(valorX));
        Float y = (Float.parseFloat(valorY));
        if (c1 == 0) {
            x = -x;
        }
        if (c12 == 0) {
            y = -y;
        }
        System.out.println(x + " ; " + y);
        //fitness = 256 - Math.abs(valor - 50);
        fitness = 148293 - ((((2+x)*(Math.pow(Math.log10(2),(2-x))))+Math.log10(1250)-4));
        //(2+x)(lg2^2-x)+lg(1250)=4
    }
*/