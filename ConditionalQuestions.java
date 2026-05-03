// import java.util.*;
// public class ConditionalQuestions {
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
        
//         if(num > 0) {
//              System.out.println("The number is positive.");
//         } else if(num < 0) {
//              System.out.println("The number is negative.");
//         } else {
//              System.out.println("The number is zero.");
//         }

//    } 
// }


//Question5:Write a Javaprogram that takes a year from
// the user and print whether that year is a leap year or not.Hint:adityapareek9649@gmail.com

import java.util.Scanner;

public class ConditionalQuestions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } 
        else {
            System.out.println("Not a Leap Year");
        }

    }
}