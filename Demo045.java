public class Demo045 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Display original numbers
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap numbers without using a third variable
        a = a + b; 
        b = a - b; 
        a = a - b; 

        // Display swapped numbers
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
