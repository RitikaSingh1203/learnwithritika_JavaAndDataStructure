// import java.util.*;
// public class MethodParameters {
//     public static void JavaParameters(int num1,int num2){
//     int sum = num1 + num2;
//     System.out.println("sum is : " + sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter value of a :" );
//         int a = sc.nextInt();
//         System.out.println("Enter value of b :" );
//         int b = sc.nextInt();
//         JavaParameters(a, b);
//     }
// }

import java.util.*;
public class MethodParameters {
    public static int JavaParameters(int num1,int num2){ // parameters or formal parameters
    int sum = num1 + num2;
    System.out.println("sum is : " + sum);
    return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :" );
        int a = sc.nextInt();
        System.out.println("Enter value of b :" );
        int b = sc.nextInt();
        int sum = JavaParameters(a, b); // arguments or actual parameters
    }
}
