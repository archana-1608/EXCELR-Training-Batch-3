import java.util.Arrays;

public class Demo071 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30, 35};

        System.out.println("Original array: " + Arrays.toString(numbers));

        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }
}
