import java.util.HashSet;

public class Demo073{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,30,10,20,30};
        
        fD(arr);
    }

    public static void fD(int[] array) {
        HashSet s = new HashSet();
        HashSet duplicates = new HashSet();

        for (int num : array) {
            if (!s.add(num)) { 
                duplicates.add(num);
            }
        }
        
        System.out.println("Duplicate elements: " + duplicates);
    }
}

