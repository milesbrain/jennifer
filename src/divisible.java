import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");

        int num = scanner.nextInt();

        if (num % 3 == 0) {
            System.out.println(num + " it is divisible by 3");
        } else {
            System.out.println(num + " Not divisible by 3");
        }
    }
}
