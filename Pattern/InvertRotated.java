package Pattern;

public class InvertRotated {

    public static void inverted_rotated(int n ){
      //outer range
      for(int i = 1; i<=n; i++)  {
        // spaces
        for(int j = 1; j<= n-i; j++){
            System.out.print(" ");
        }
        //start
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
      }
    }
    public static void main(String[] args) {
      inverted_rotated(6);  
    }
}
