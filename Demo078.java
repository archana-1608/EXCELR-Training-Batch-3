import java.util.Arrays;

public class Demo078 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,1,2,3};
        int[] a = arrangeEvenOdd(arr);
        System.out.println("Rearranged Array: " + Arrays.toString(a));
    }

    public static int[] arrangeEvenOdd(int[] arr) {
        int[] result = new int[arr.length];
        int left = 0, right = arr.length - 1;
        
        for (int b : arr) {
            if (b % 2 == 0) {
                result[left++] = b; 
            } else {
                result[right--] = b; 
            }
        }
        return result;

    }

}

