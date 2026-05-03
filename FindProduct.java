// public class FindProduct {
//     public static int multiply(int a,int b){
//     int product = a * b;
//     return product;
//     }
//     public static void main(String[] args) {
//       int prod= multiply(3, 5) ;
//        System.out.println(prod);
//     }
// }

// Factorial of a number n
public class FindProduct {

    public static int factorial(int n){
     int fact = 1;

     for(int i = 1;i<=n;i++){
        fact = fact * i;
     }
     return fact;
    }

    public static void main(String[] args) {
        System.out.println( "Factorial of number: = " + factorial(8));
    }
}               

