package Array;

public class LargestNumber {
    public static int getInteger(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<numbers.length;i++){
            if(largest< numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        //System.out.println("The smallest number is: " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,5,6,9,10,39};
        int largest = getInteger(numbers);
        int smallest = getInteger(numbers);
        System.out.println("The largest number is: " + largest);
        
    }
}
