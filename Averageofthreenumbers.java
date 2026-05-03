//Question1:Inaprogram,input3numbers:A,BandC.You have to output the average 
// of these 3 numbers.(Hint : Average of N numbers is sum of those 
// numbers divided by N)

// import java.util.*;
// public class Averageofthreenumbers {
// public static void main (String args[]){
//     Scanner sc = new Scanner(System.in);
//     int A = sc.nextInt();
//     int B = sc.nextInt();
//     int C = sc.nextInt();

//     double average = (A+B+C)/3.0;
//     System.out.println(average);
// }
// }

// Question2:In a program,input the side of asquare.
// You have to output the area of the square.
// (Hint : area of a square is (side x side))

// import java.util.*;
// public class Averageofthreenumbers {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int side = sc.nextInt();
//         int area = side*side;
//         System.out.println(area);
//     }
// }

//Question3:Enter cost of 3 items from the user(usingfloatdatatype)
// -a pencil,a pen and an eraser. You have to output the total cost 
// of the items back to the user as their bill.
// (Add on :  You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.*;
public class Averageofthreenumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total  = pencil + pen + eraser;
        System.out.println("Bill is: " + total);

        float newtotal = total + (0.18f * total);
        System.out.println("Total with GST is: " + newtotal);
    }
}