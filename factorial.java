import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        if(n<0){
            System.out.println("Factorial not Defined");
        } else{
            for(int i = 1; i<=n; i++){
                fact = fact * i;
            }
            System.out.println("Factorial = " + fact);
        }
    }
}
