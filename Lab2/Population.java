package lab2;
public class Population {

	public static void main(String[] args) {
		
		double population =175000;
		double population2=262500;

		double increasedPopulation = population2-population;
		System.out.println("Increased Population "+increasedPopulation);
		double increasedPopulationPerYear =increasedPopulation/10;
		System.out.println("Increased population per year "+increasedPopulationPerYear);


		double avgPercentPerYear =(increasedPopulationPerYear/population)*100;
		System.out.println("Average of increase population per year is "+avgPercentPerYear+"%");
	}		
	}

