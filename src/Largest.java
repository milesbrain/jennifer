import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num = input.nextInt();

        System.out.print("Enter second number : ");
        int num1 = input.nextInt();

        System.out.print("Enter third number : ");
        int num2 = input.nextInt();

        System.out.println("Enter fourth number : ");
        int num3 = input.nextInt();

        System.out.println("Enter fifth number : ");
        int num4 = input.nextInt();

        if (num>=num1&&num>=num2&&num>=num3&&num>=num4){
            System.out.println("The largest number is " + num);
        }
        else if (num1>=num&&num1>=num2&&num1>=num3&&num1>=num4){
            System.out.println("The largest number is " + num1);
        }
        else if (num2>=num&&num2>=num1&&num2>=num3&&num2>=num4){
            System.out.println("The largest number is " +num2);
        }
        else if (num3>=num&&num3>=num1&&num3>=num3&&num3>=num4){
            System.out.println("The largest number is " +num3);
        }
        else {
            System.out.println("The largest number is " + num4);
        }

        if (num<=num1&&num<=num2&&num<=num3&&num<=num4){
            System.out.println("The smallest number is " + num);
        }
        else if (num1<=num&&num1<=num2&&num1<=num3&&num1<=num4){
            System.out.println("The smallest number is " + num1);
        }
        else if (num2<=num&&num2<=num1&&num2<=num3&&num2<=num4){
            System.out.println("The smallest number is " +num2);
        }
        else if (num3<=num&&num3<=num1&&num3<=num3&&num3<=num4){
            System.out.println("The smallest number is " +num3);
        }
        else {
            System.out.println("The smallest number is " + num4);
        }



    }
}
