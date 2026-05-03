package Array;

public class BinarySearch {
    public static int Binary_Search(int numbers[],int target){
      int start = 0,end = numbers.length-1;
      
      while (start<=end) {
        int mid = (start+end)/2;

        // comparison
        if(numbers[mid] == target){ //found
            return mid;
        }
        if (numbers[mid]<target){ //right
            start = mid + 1;
        } else { // left
            end = mid - 1;
        }
        
      }
      return -1;
    } 
    public static void main(String[] args) {
        int numbers[] = {1,2,4,5,7,8,9,10,30};
        int target = 9;
        System.out.println("index for key is: " + Binary_Search(numbers, target));
    }
}
