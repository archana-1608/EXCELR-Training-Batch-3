public class Demo061 {
    public static void main(String[] args) {
        int count = 0, num = 2;
        
        System.out.println("1 to 10 prime numbers:");
        
        // Loop until we find 10 prime numbers
        while (count <4) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
