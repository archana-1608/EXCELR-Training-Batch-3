public class Demo062 {
    public static void main(String[] args) {
        int[] ar ={10,20,30,40,50};
        if (ar.length > 0) {
            System.out.println("First element: " + ar[0]);
            
            if (ar.length > 1) {
                System.out.println("Second element: " + ar[1]);
            }
            
            System.out.println("Last element: " + ar[ar.length - 1]);
        } else {
            System.out.println("Array is empty.");
        }

    }
}
