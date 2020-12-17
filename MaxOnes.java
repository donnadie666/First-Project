public class MaxOnes{
        public static void main(String[]args){
            GeneticAlgorithm ga=new GeneticAlgorithm(100,0.001,0.95,2);
            Population population=ga.initPopulation(50);
            ga.evalPopulation(population);
            int generation=1;
            while(ga.isTerminationConditionMet(population)==false){
                System.out.println("Best solution: "+population.getFitness(0).toString());
                population=ga.crossoverPopulation(population);
                population=ga.mutatePopulation(population);
                ga.evalPopulation(population);
                generation++;
            }
            System.out.println("Found solution in"+generation+" generations");
            System.out.println("Best solution: "+population.getFitness(0).toString()); 
        }
}