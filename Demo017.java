import java.util.Scanner;

public class Demo017 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
 
            int tensDigit = number / 10; 
            int onesDigit = number % 10; 


            int sum = tensDigit + onesDigit;

            System.out.println("The sum of the digits is: " + sum);
        } else {
            System.out.println("Please enter a valid two-digit number.");
        }
        scanner.close();
    }
}
