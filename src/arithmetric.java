    import java.util.Scanner;

public class arithmetric {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num = input.nextInt();

        System.out.print("Enter second number : ");
        int num1 = input.nextInt();

        System.out.print("Enter third number : ");
        int num2 = input.nextInt();

        int sum = num + num1 + num2;
        System.out.printf("The sum of the numbers is : %d%n", sum);

        int average = sum / 3;
        System.out.printf("The average of the numbers is : %d%n", average);

        int product = num * num1 * num2;
        System.out.printf("The product of the numbers is : %d%n", product);


        if (num >= num1 && num >= num2) {
            System.out.printf("The largest number is : %d%n", num);
        } else if (num1 >= num && num1 >= num2) {
            System.out.printf("The largest number is : %d%n", num1);
        } else {
            System.out.printf("The largest number is : %d%n", num2);
        }


        if (num <= num1 && num <= num2) {
            System.out.printf("The smallest number is : %d%n", num);
        } else if (num1 <= num && num1 <= num2) {
            System.out.printf("The smallest number is : %d%n", num1);
        } else {
            System.out.printf("The smallest number is : %d%n", num2);
        }
    }
}
