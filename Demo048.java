import java.util.Scanner;
public class Demo048 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=s.nextInt();

        int sum = 0;
        a = Math.abs(a);

        while (a > 0) {
            sum += a % 10;
            a /= 10;

        }
        System.out.println("The sum of the digits is: " + sum);
        
    }

}
