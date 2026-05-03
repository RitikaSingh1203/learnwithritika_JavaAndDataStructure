package Array;

public class PrintSubarrays {
    public static void Print_Subarrays(int numbers[]){
        int ts = 0;
        for(int i = 0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + ts);
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        Print_Subarrays(numbers);
    }
}
