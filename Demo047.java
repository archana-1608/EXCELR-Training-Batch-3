import java.util.Scanner;

public class Demo047 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=s.nextInt();

        int count = 0;
        if (a == 0) {
            count = 1;
        } else {
            a = Math.abs(a);
            while (a > 0) {
                a /= 10;
                count++;
            }
        }

        System.out.println("The number of digits is: " + count);

    }

}
