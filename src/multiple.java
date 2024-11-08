import java.util.Scanner;

public class multiple {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");

        int num = input.nextInt();

        System.out.println("Enter second number");

        int num1 = input.nextInt();

        if ((3*num)%(2*num1)==0){
            System.out.println("The triple of the first number is a multiple of the double of the second number.");
        }
        else {
            System.out.println("The triple of the first number is not a multiple of the double of the second number.");
        }
    }
}
