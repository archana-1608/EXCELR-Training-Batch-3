public class Demo022 {
    public static void main(String[] args) {

    int a = 2024;
    if (a%4==0 && a%100 !=0){
        System.out.println("Leap Year");
    }else if (a%400 == 0) {
        System.out.println("Leap Year");
        
    }else{
        System.out.println("Not a Leap Year");
    }
}
}
