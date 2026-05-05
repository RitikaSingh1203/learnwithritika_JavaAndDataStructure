import java.util.*;

public class KadanesAlgorithm {

    public static void maxSubarray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            // update maximum
            if(currSum > maxSum) {
                maxSum = currSum;
            }

            // reset if negative
            if(currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSubarray(arr);
    }
}
