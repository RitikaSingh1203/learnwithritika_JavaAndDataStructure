package Pattern;

public class butterflyPattern {
    public static void Butterfly_Pattern(int n){
       for(int i=1;i<=n;i++){
        //stars
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        //space
        for(int j = 1;j <=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j = 1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       for(int i = n;i>=1;i--){
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        //space
        for(int j = 1;j <=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j = 1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
       Butterfly_Pattern(10); 
    }
}
