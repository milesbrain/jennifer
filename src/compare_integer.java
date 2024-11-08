import java.util.Scanner;

public class compare_integer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int num = scanner.nextInt();

        int num_sq = num * num;


        if (num_sq == 100){
            System.out.println("The square of the number is equal to 100");
        }
        else if (num_sq>100){
            System.out.println("It is greater than 100");
        }
        else if (num_sq<100){
            System.out.println("It is less than 100");
        }
        else {
            System.out.println("Wrong");
        }
    }
}
