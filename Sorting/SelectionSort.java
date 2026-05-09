package Sorting;

public class SelectionSort {
    public static void Selection_Sort(int arr[]){
        for(int turn = 0; turn<arr.length;turn++){
          int minPosition = turn;  
          for(int j = turn + 1; j<arr.length;j++){
            if(arr[minPosition]>arr[j]){
                minPosition = j;
            }

          }
          //swap
          int temp = arr[minPosition];
          arr[minPosition] = arr[turn];
          arr[turn] = temp;
        }
     
    }
       public static void PrintSelection_Sort(int arr[]){
            for(int i = 0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Selection_Sort(arr);
        PrintSelection_Sort(arr);
    }
}


