class LTCode002 {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            result = result * 10 + digit;
        }
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        LTCode002 s = new LTCode002();
        
        // Test cases
        int test1 = 123;
        int test2 = -123;
        int test3 = 120;
        int test4 = 0;
        int test5 = 1534236469; // Overflow case
        
        // Print results
        System.out.println("Input: " + test1 + ", Output: " + s.reverse(test1));
        System.out.println("Input: " + test2 + ", Output: " + s.reverse(test2));
        System.out.println("Input: " + test3 + ", Output: " + s.reverse(test3));
        System.out.println("Input: " + test4 + ", Output: " + s.reverse(test4));
        System.out.println("Input: " + test5 + ", Output: " + s.reverse(test5));
    }
}

