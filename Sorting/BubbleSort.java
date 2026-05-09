// package Sorting;

// public class BubbleSort {
//     public static void Bubble_Sort(int arr[]){
//         for(int turn = 0; turn<arr.length; turn++){
//             for(int j = 0;j<arr.length-1-turn;j++){
//                 if(arr[j]>arr[j+1]){
//                   //swap
//                   int temp = arr[j];
//                   arr[j] = arr[j+1];
//                   arr[j+1] = temp;  
//                 }
//             }

//         }

//     }
//     public static void Print_BubbleSort(int arr[]){
//         for(int i = 0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }




//     public static void main(String[] args) {
//         int arr[] = {5,4,1,3,2};
//         Bubble_Sort(arr);
//         Print_BubbleSort(arr);
//     }
// }

package Sorting;

public class BubbleSort {

    public static void Bubble_Sort(int arr[]) {

        for(int turn = 0; turn < arr.length-1; turn++) {

            int swap = 0;

            for(int j = 0; j < arr.length-1-turn; j++) {

                if(arr[j] > arr[j+1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap = 1;
                }
            }

            // no swapping means array already sorted
            if(swap == 0) {
                break;
            }
        }
    }

    public static void printArr(int arr[]) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {1,2,3,4,5};

        Bubble_Sort(arr);

        printArr(arr);
    }
}