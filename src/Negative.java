import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number ");
        int num = input.nextInt();

        System.out.println("Enter second number ");
        int num1 = input.nextInt();

        System.out.println("Enter third number ");
        int num2 = input.nextInt();

        System.out.println("Enter fourth number ");
        int num3 = input.nextInt();

        System.out.println("Enter fifth number ");
        int num4 = input.nextInt();


        if (num > 0) {
            System.out.println("The first number is positive");
        } else if (num < 0) {
            System.out.println("The first number is negative");
        } else {
            System.out.println("The first number is zero");
        }

        if (num1 > 0) {
            System.out.println("The second number is positive");
        } else if (num1 < 0) {
            System.out.println("The second number is negative");
        } else {
            System.out.println("The second number is zero");
        }

        if (num2 > 0) {
            System.out.println("The third number is positive");
        } else if (num2 < 0) {
            System.out.println("The third number is negative");
        } else {
            System.out.println("The third number is zero");
        }

        if (num3 > 0) {
            System.out.println("The fourth number is positive");
        } else if (num3 < 0) {
            System.out.println("The fourth number is negative");
        } else {
            System.out.println("The fourth number is zero");
        }

        if (num4 > 0) {
            System.out.println("The fifth number is positive");
        } else if (num4 < 0) {
            System.out.println("The fifth number is negative");
        } else {
            System.out.println("The fifth number is zero");
        }


    }
}
