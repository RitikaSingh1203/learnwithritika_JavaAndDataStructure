public class Swap {
    public static void SwapNumber(int a,int b){
        int temp = a;
        a = b;
        temp = b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        SwapNumber(a, b);
        System.out.println("a = " + b);
        System.out.println("b = " + a);
    }
}
