package Array;

import java.util.*;
public class LinearSearch {

    public static int Linear_Search(int numbers[],int target){
        for(int i = 0; i<numbers.length;i++){
           if(numbers[i]== target){
            return i;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = { 10,20,30,40,50,60,70,80};
        int target = 50;

        int index = Linear_Search(numbers, target);
        if(index == -1){
            System.out.println("Not found");
        } else {
            System.out.println("key is at index: " + index);
        }
    }
    
}



