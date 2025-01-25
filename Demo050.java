public class Demo050{
    public static void main(String[] args) {
        int number = 5;
        int limit = 10; 

        System.out.println("Multiplication Table of " + number);

        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

