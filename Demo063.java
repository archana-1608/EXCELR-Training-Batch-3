public class Demo063 {
    public static void main(String[] args) {
        int[] ar={10,20,30,40,50};
        if (ar.length > 0) {
            int sum = ar[0] + ar[ar.length - 1];
            System.out.println("Sum of first and last element: " + sum);
        } else {
            System.out.println("Array is empty.");
        }
    }

}
