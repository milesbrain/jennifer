import java.util.Scanner;

public class mass_index {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Enter your weight in kg : ");

        int weight = input.nextInt();

        System.out.println("Enter your height in meters :");

        int height = input.nextInt();

        int BMI = weight/(height*height);

        System.out.printf("The Body mass index of the height of %d and weight of %d = %d" ,height,weight ,BMI);
    }
}
