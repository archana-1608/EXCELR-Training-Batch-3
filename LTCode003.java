class LTCode003 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        
        int index = 0;
        int sign = 1;
        long result = 0;
        
        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }
        
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            index++;
            
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        
        return (int) (result * sign);
    }

    // Main method for testing
    public static void main(String[] args) {
        LTCode003 solution = new LTCode003();
        
        // Test cases
        String test1 = "42";
        String test2 = "   -42";
        String test3 = "4193 with words";
        String test4 = "words and 987";
        String test5 = "-91283472332";
        
        // Print results
        System.out.println("Input: \"" + test1 + "\", Output: " + solution.myAtoi(test1));
        System.out.println("Input: \"" + test2 + "\", Output: " + solution.myAtoi(test2));
        System.out.println("Input: \"" + test3 + "\", Output: " + solution.myAtoi(test3));
        System.out.println("Input: \"" + test4 + "\", Output: " + solution.myAtoi(test4));
        System.out.println("Input: \"" + test5 + "\", Output: " + solution.myAtoi(test5));
    }
}

