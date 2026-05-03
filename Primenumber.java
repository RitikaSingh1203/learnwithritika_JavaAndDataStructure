// import java.util.*;
// public class Primenumber {
// public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();

//    if(n==2){
//     System.out.println(n + " is Prime");
//     } else{
//       boolean isPrime = true;
//    for(int i = 2; i<=n-1; i++){
//     if(n%i==0){
//         isPrime = false;
//     }
//    }
//    if(isPrime==true){
//     System.out.println(n + " is Prime");
//    }else{
//     System.out.println(n + " is Not Prime");
//    }
//     }

   
// }
// }

import java.util.*;
public class Primenumber {
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();

   if(n==2){
    System.out.println(n + " is Prime");
    } else{
      boolean isPrime = true;
   for(int i = 2; i<=Math.sqrt(n); i++){
    //In Java, Math.sqrt() is used to calculate the 
    // square root of a number.
    if(n%i==0){ // n is a multiple of i 
        //(i not equal to 1 or n)
        isPrime = false;
    }
   }
   if(isPrime==true){
    System.out.println(n + " is Prime");
   }else{
    System.out.println(n + " is Not Prime");
   }
    }

   
}
}