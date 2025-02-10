public class Demo075 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        
        int maxNumber = findMax(array);
        System.out.println("Maximum number: " + maxNumber);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

