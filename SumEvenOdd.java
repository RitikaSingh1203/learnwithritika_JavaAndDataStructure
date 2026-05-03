import java.util.*;
public class SumEvenOdd {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
       int n = sc.nextInt();
       int evenSum = 0,oddSum = 0;
      
       for(int i = 1; i<=n;i++){
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num % 2 == 0){
            evenSum += num;
        } else {
            oddSum +=num;
        }
       } 
         System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

