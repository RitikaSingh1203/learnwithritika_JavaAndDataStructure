// import java.util.*;
// public class BreakandContinue {
// 	public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.println("Enter a number: ");
//             int n = sc.nextInt();

//             if(n%10==0){
//                 break; // break stops the loop completely 
//             }
//             System.out.println(n);
//         } while(true);
//     }
// }

// <<< Continue statement >>>

import java.util.*;
public class BreakandContinue {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      for(int i = 1;i<=5;i++){
        if (i==3) {
            continue;
        }
        System.out.println(i);
      }  
    }
    
}
