import java.util.Scanner;

public class circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius value");

        int radius = input.nextInt();

        System.out.printf("Diameter :%d%n",2*radius);

        System.out.printf("circumference : %.2f%n",2*3.14159*radius);

        System.out.printf("Area of a circle : %.2f%n",3.14159*(radius*radius));
    }
}
