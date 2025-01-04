import java.util.Scanner;

public class Demo009 {

    public static void acceptDetails(String customerName, String accountNumber, double balance) {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Total Balance: " + balance);
    }

    public static void displayDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter Total Balance: ");
        double balance = scanner.nextDouble();

        acceptDetails(customerName, accountNumber, balance);
    }

    public static void main(String[] args) {
        displayDetails();
    }
}
