package TwoDARRAY;
import java.util.*;

public class Matrices {
   public static void main(String[] args) {
     int matrix[][] = new int[4][4];
    int n = 4, m = 4;
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i<n; i++){
        for(int j = 0; j < m; j++){
           matrix[i][j] = sc.nextInt(); 
        }
    }
    for(int i = 0; i<n; i++){
        for(int j = 0; j < m; j++){
           System.out.print(matrix[i][j] + " "); 
        }
        System.out.println();
    }
   }
}
