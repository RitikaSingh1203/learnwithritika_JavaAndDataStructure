// public class ReverseNumber {
//     public static void main(String[] args) {
//         int n = 506789;

//         while(n>0){
//             int lastdigit = n%10;
//             System.out.print(lastdigit + " ");
//             n = n/10;
//         }
//         System.out.println();
//     }
// }

// public class ReverseNumber {

//     public static void main(String[] args) {
//         long n = 12345678910L;
//         while(n>0){
//             long lastdigit = n%10;
//             System.out.print(lastdigit+ " ");
//             n/=10;
//         }
//         System.out.println();
//     }
// }

// <<< Reversing the number >>>

public class ReverseNumber {

    public static void main(String[] args) {
        int n = 123456789;
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;
            rev = rev * 10 + lastdigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}