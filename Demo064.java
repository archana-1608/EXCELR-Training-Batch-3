public class Demo064 {
    public static void main(String[] args) {
        int[] ar={10,20,30,40,50};
        if(ar.length>1){
            int temp = ar[0];
            ar[0] = ar[ar.length-1];
            ar[ar.length-1]=temp;

        }
        System.out.println("After swapping first and last element: ");
        for(int num : ar){
            System.out.print(num+" ");
        }

    }

}
