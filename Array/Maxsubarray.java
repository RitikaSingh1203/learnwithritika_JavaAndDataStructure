//<<<<<  1st approach: O(n^3) >>>>>>

//  package Array;

//  public class Maxsubarray {
//     public static void Max_SubarraySum(int numbers[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         // print prefix
//         for(int i = 1; i<prefix.length;i++){
//             prefix[i] = prefix[i - 1] + numbers[i];
//         }
//         for(int i = 0; i<numbers.length;i++){
//          int start = i;
//          for(int j = i;j<numbers.length;j++){
//             int end = j;
            
//             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
//             if(maxSum<currSum){
//                 maxSum = currSum;
//             }
//          }

//         }
//         System.out.println("The maximum subarray sum is: " + maxSum);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1,-2,3,4,-1,6};
//         Max_SubarraySum(numbers);
//     }
 // }

 //<<<  2nd approach: O(n^2) >>>>>>
//  package Array;

//  public class Maxsubarray {
//     public static void PrintSubarray(int numbers[]){
//     int currSum = 0;
//     int maxSum = Integer.MIN_VALUE;
//     int prefix[] = new int[numbers.length];
    
//     prefix[0] = numbers[0];
//     for(int i = 1; i<numbers.length;i++){
//       prefix[i] = prefix[i-1]+numbers[i];
//     }
//     for(int i = 0;i<numbers.length;i++){
//       for(int j = i;j<numbers.length;j++){
//       if(i==0){
//         currSum = prefix[j];
//       } else{
//         currSum = prefix[j] - prefix[i-1];
//       }
//         if(maxSum < currSum){
//         maxSum = currSum;
//     }
//       }
//     }
//     System.out.println("The maximum Subarray is : " + maxSum);
//   }
//     public static void main(String[] args) {
//      // System.out.println("Hello, World!");
//      int numbers[] = {-1,4,-2,5};
//      PrintSubarray(numbers);
// }
//     }


// <<<  3rd approach: O(n) >>>>>>
import java.util.*;

public class  Maxsubarray {
 
    public static void maxSubarray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            currSum += numbers[i];

            if(currSum > maxSum){
                maxSum = currSum;
            }

            if(currSum < 0){
                currSum = 0;
            }
        }

        System.out.println("Max subarray sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-1,4,-2,5};
        maxSubarray(numbers);
    }

}