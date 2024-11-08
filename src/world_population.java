import java.util.Scanner;

public class world_population {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the current world population (in billions, e.g., 8.07 for 8.07 billion):");
        double worldPopulation = input.nextDouble();

        System.out.println("Enter the annual world population growth rate (as a percentage, e.g., 1.2 for 1.2%):");
        double growthRate = input.nextDouble();


        double growthRateDecimal = growthRate / 100;


        double oneYearPopulation = worldPopulation * (1 + growthRateDecimal);
        System.out.printf("Estimated world population after 1 year: %.2f billion%n", oneYearPopulation);

        double twoYearPopulation = oneYearPopulation * (1 + growthRateDecimal);
        System.out.printf("Estimated world population after 2 years: %.2f billion%n", twoYearPopulation);

        double threeYearPopulation = twoYearPopulation * (1 + growthRateDecimal);
        System.out.printf("Estimated world population after 3 years: %.2f billion%n", threeYearPopulation);

        double fourYearPopulation = threeYearPopulation * (1 + growthRateDecimal);
        System.out.printf("Estimated world population after 4 years: %.2f billion%n", fourYearPopulation);

        double fiveYearPopulation = fourYearPopulation * (1 + growthRateDecimal);
        System.out.printf("Estimated world population after 5 years: %.2f billion%n", fiveYearPopulation);
    }
}
