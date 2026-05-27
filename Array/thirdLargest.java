// Java program to find the third largest
// element in an array.
import java.util.Arrays;

class thirdLargest {
    static int thirdLargest(int[] arr) {
        int n = arr.length;
        
        // If the array has less than 3 elements, return -1
        if (n < 3) {
            return -1;
        }
        
        // Sort the array 
        Arrays.sort(arr);
        
        // Return the third largest element 
        return arr[n - 3];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(thirdLargest(arr));
    }
}