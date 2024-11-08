import java.util.Scanner;

public class GreatPyramidStatistics {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the estimated number of stones used:");
        long numberOfStones = input.nextLong();


        System.out.println("Enter the average weight of each stone (in kilograms):");
        double weightPerStone = input.nextDouble();

        System.out.println("Enter the number of years taken to build the pyramid:");
        int yearsToBuild = input.nextInt();


        int daysPerYear = 365;
        int hoursPerDay = 24;
        int minutesPerHour = 60;


        double totalWeight = numberOfStones * weightPerStone;


        double weightPerYear = totalWeight / yearsToBuild;


        double weightPerHour = weightPerYear / (daysPerYear * hoursPerDay);


        double weightPerMinute = weightPerHour / minutesPerHour;


        System.out.printf("Estimated total weight of the pyramid: %.2f kg%n", totalWeight);
        System.out.printf("Estimated weight built per year: %.2f kg%n", weightPerYear);
        System.out.printf("Estimated weight built per hour: %.2f kg%n", weightPerHour);
        System.out.printf("Estimated weight built per minute: %.2f kg%n", weightPerMinute);
    }
}
