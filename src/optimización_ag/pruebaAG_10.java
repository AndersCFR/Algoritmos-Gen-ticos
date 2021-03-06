/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimización_ag;

import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;

/**
 *
 * @author Anderson
 */
public class pruebaAG_10 {
   public void empezar() {
        try {
            //Configuramos JGAP
            Configuration configuracion = new DefaultConfiguration();
            FitnessFunction funcion = new funcionApt_10();
            configuracion.setFitnessFunction(funcion); //Le indicamos a JGAP cual sera nuestra funcion de aptitud
            Gene[] genEjemplo = new Gene[13];

            //Creamos una codificacion de 8 genes que nos servira para nuestros individuos (fenotipo)
            //Los genes seran valores entre 0 y 1  ejem 01001110 individuo ejemplo
            genEjemplo[0] = new IntegerGene(configuracion, 0, 1);
            genEjemplo[1] = new IntegerGene(configuracion, 0, 1);
            genEjemplo[2] = new IntegerGene(configuracion, 0, 1);
            genEjemplo[3] = new IntegerGene(configuracion, 0, 1);
            genEjemplo[4] = new IntegerGene(configuracion, 0, 1);
            genEjemplo[5] = new IntegerGene(configuracion, 0, 1);
            genEjemplo[6] = new IntegerGene(configuracion, 0, 1);
            genEjemplo[7] = new IntegerGene(configuracion, 0, 1);
            genEjemplo[8] = new IntegerGene(configuracion, 0, 1);
            genEjemplo[9] = new IntegerGene(configuracion, 0, 1);
            genEjemplo[10] = new IntegerGene(configuracion, 0, 1);
            genEjemplo[11] = new IntegerGene(configuracion, 0, 1);
            genEjemplo[12] = new IntegerGene(configuracion, 0, 1);
        

            //Recordemos que los cromosomas son el correspondiente a los individuos
            //Creamos un individuo a partir de la configuracion de los genes anterior
            Chromosome cromosomaNumero = new Chromosome(configuracion, genEjemplo);
            //Le indicamos a JGAP un ejemplo de como seran los individuos, a partir del individuo de ejemplo que creamos
            configuracion.setSampleChromosome(cromosomaNumero);
            configuracion.setPopulationSize(5); //Creamos nuestra poblacion inicial
            //Creamos el genotipo de la poblacion
            //Recordemos que el genotipo se determina del fenotipo = la configuracion de los genes para un cromosoma particular
            Genotype population = Genotype.randomInitialGenotype(configuracion);
            //Comienza a iterar el algoritmo
            System.out.println("Poblacion inicial");
            mostrarIndividuos show = new mostrarIndividuos();
            for (int m = 0; m < 5; m++) { //50 iteraciones, cada iteracion sera una generacion
                System.out.println("-------------------Inicio generacion-------------------");
                System.out.println("Iteracion #" + m);
                show.mostrarTodosIndividuos_5bits(population.getChromosomes());
                population.evolve(10);
                //show.mostrarTodosIndividuos(population.getChromosomes());
                IChromosome mejor_individuo = population.getFittestChromosome(); //Obtenemos el mejor individuo para esta generacion
                //System.out.println("Mejor Individuo de la generacion " + m + " :");
                System.out.print("Mejor individuo:  ");
                show.mostrarIndividuo_5bits(mejor_individuo);
               
                System.out.println("");
                System.out.println("Valor de aptitud obtenido:" + mejor_individuo.getFitnessValue());
                System.out.println("-------------------Fin generacion-------------------");
            }
           
            System.out.println(" Valor optimizado ");
            System.out.print("Valor en x:");
            show.mostrarIndividuo_5bits(population.getFittestChromosome()); //mejor individuo obtenido
            funcionApt_10 f = new funcionApt_10();
            double y = f.getY(show.obtenerValorIndividuo_5bits(population.getFittestChromosome()));
            System.out.print("Valor en y:  "+y);
            System.out.println("");

        } catch (InvalidConfigurationException ex) {
            System.out.println("No se pudo ejecutar el AG");
        }
    }
}
