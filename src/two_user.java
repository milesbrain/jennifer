import java.util.Scanner;

public class two_user {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : " );

        int num1 = input.nextInt();

        System.out.print("Enter the second number : ");

        int num2 = input.nextInt();

        int num1_sq = num1 * num2;
        int num2_sq = num2 * num2;

        System.out.printf("The square of the first number is : %d%n",num1_sq );
        System.out.printf("The square of the second number is : %d%n",num2_sq);

        System.out.printf("The sum of the squares is :%d%n",num1_sq + num2_sq);

        System.out.printf("The difference between the numbers is : %d%n",num1_sq - num2_sq);





    }
}
