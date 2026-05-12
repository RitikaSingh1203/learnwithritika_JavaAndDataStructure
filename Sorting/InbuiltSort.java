 package Sorting;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

// public class InbuiltSort {
//     public static void main(String[] args) {
//         int arr[] = {5,3,1,4,2};
//         Arrays.sort(arr);
//         for(int i = 0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
// Reverse inbuilt sorting (Decending order)
// Arrays.sort(arr, Collections.reverseOrder());

public class InbuiltSort{
public static void main(String[] args) {
    Integer arr[] = {5,3,1,4,2};
    Arrays.sort(arr,Collections.reverseOrder());
    System.out.println(Arrays.toString(arr));
}
}