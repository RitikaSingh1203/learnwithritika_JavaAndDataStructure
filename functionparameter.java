// <<< Function Overloading using Parameter >>>

// public class functionparameter {
//     //funtion to calculate  sum of 2 number
// public static int sum(int a ,int b){
//   return a+b;
// }
// //function to calculate sum of  3 num
// public static int sum(int a,int b,int c){
//     return a+b+c;
// } 

//   public static void main(String[] args) {
//     System.out.println(sum(7,9));
//     System.out.println(sum(7,9,6));
//   }  
// }


//  <<< Function Overloading using Datatypes >>>

public class functionparameter {
    public static int sum (int a,int b){
        return a+b;
    } 
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(40,60));
        System.out.println(sum(5.5f ,4.6f));

    }
}