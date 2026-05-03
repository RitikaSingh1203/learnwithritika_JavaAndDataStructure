import java.util.*;
// public class PrimeFunction {
//    public static boolean isPrime(int n){
//     boolean isPrime = true;
//     for(int i = 2;i<=n-1;i++){
//         if(n%2==0){ // completely deviding n by i means
//             isPrime=false;
//             break;
//         }
//     }
//     return isPrime;
//    }
//    public static void main(String[] args) {
//     System.out.println(isPrime(7));
//    }
// }


// if we deleted the boolean variable and directly return true or false
//  then also the code will work fine but it is not a good practice to do that because it will make the code less readable and less maintainable.

// public class   {
//    public static boolean isPrime(int n){
//     //corner cases 
//     if (n==2){
//         return true;
//     }
//     for(int i = 2;i<=n-1;i++){
//         if(n%2==0){ // completely deviding n by i means
//           return false;
//         }
//     }
//     return true;
//    }
//    public static void main(String[] args) {
//     System.out.println(isPrime(8));
//    }
// }

// corner case of 1 is not a prime number because it has only one factor which is 1 itself.
// if we want to handle the corner case of 1 then we can add a condition at the beginning of the 
// function to check if n is equal to 1 then return false because 1 is not a prime number.


// <<< Print all primes in a range >>>
public class PrimeFunction {
    
        public static boolean isPrime(int n){
    //corner cases 
    if (n==2){
        return true;
    }
    // for(int i = 2;i<=n-1;i++){
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){ // completely deviding n by i means
          return false;
        }
    }
    return true;
   }
 
    public static void PrimeinRange(int n){
        for(int i = 2;i<=n;i++){
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
        public static void main(String[] args) {
         PrimeinRange(40);
    }
}