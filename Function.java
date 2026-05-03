// public class Function {
//     static void ritikaSoftwareEngineer(){
//         System.out.println("I am a Software Engineer");
//     }
//    public static void main(String[] args) {
//     ritikaSoftwareEngineer();
//    } 
// }

// public class Function {
//     public static int ritikaProgrammer(){
//         System.out.println("I am a Programmer");
//         System.out.println("I am a Programmer");
//         System.out.println("I am a Programmer");

//         return 3;
//     }
//     public static void main(String[] args) {
//        ritikaProgrammer(); 
//     }
// }


// FUNCTIONS QUESTIONSQuestion 1 :Write a Java method to compute the 
// average of three numbers

// public class Function {

//     public static double AverageFunction(int a,int b,int c){
//         return (a+b+c)/3;
//     }
//      public static void main(String[] args) {
//         double result = AverageFunction(20, 23, 40);
//         System.out.println("Average of three numbers: " + result   );
//      }
// }

// <<< Question2:Write name tho dnamedisEventhatacceptsanintargument.Themethodshouldreturntrueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyourmethod.

// public class Function {
    
//     public static boolean isEven(int n){
//         return n % 2 ==0;
//     }
//     public static void main(String[] args) {
//         int n = 8;

//         if (isEven(n)) {
//            System.out.println(n + " is Even"); 
//         } else {
//             System.out.println(n + " is Odd");
//         }
//     }
// }


// <<<  PALIDROME QUESTION >>>

// | Line               | Work              |
// | ------------------ | ----------------- |
// | `%10`              | Last digit निकालो |
// | `reverse*10+digit` | Reverse बनाओ      |
// | `/10`              | Last digit हटाओ   |

// public class Function {

//     public static boolean isPalindrome(int number){
//         int original = number;
//         int reverse = 0;

//         while (number>0) {
//             int digit = number % 10;
//             reverse = reverse * 10 + digit;
//             number = number / 10;   
//         }

//         return original == reverse;
//     }
    
//     public static void main(String[] args) {
//         int num = 1221;

//         if(isPalindrome(num)){
//             System.out.println(num + " is Palindrome");
//         } else {
//             System.out.println(num + "is Not Palindrome");
//         }
        
//     }
// }

// <<< math functions >>>

// public class Function {

//     public static void main(String[] args) {

//         System.out.println("Min = " + Math.min(10, 5));

//         System.out.println("Max = " + Math.max(10, 5));

//         System.out.println("Square Root = " + Math.sqrt(25));

//         System.out.println("Power = " + Math.pow(2, 3));

//         System.out.println("Absolute = " + Math.abs(-15));

//         // Average manually
//         int a = 10, b = 20;
//         double avg = (a + b) / 2.0;
//         System.out.println("Average = " + avg);
//     }
// }

// <<< SUM OF DIGITS >>>
public class Function {

    public static int digitSum(int num){
        int sum = 0;

        while (num>0) {
            int digit = num % 10;  // last digit
            sum = sum + digit;  // add to sum
            num = num/10;   // remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
       int n = 23456;
       System.out.println("Sum of digits = " + digitSum(n)); 
    }
} 