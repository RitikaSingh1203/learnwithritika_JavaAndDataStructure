public class BinaryToDecimal {
    public static void Bintodecimal(int binNum){
        int pow=0;
        int decNum = 0;

        while (binNum>0) {
           int lastdigit = binNum % 10;
           decNum = decNum + (lastdigit * (int)Math.pow(2, pow));
           pow++;
           binNum = binNum / 10;
        }
        System.out.println("Decimal of " + binNum + ": " + decNum);
    }
    public static void main(String[] args) {
        Bintodecimal(1010); // Example usage
    }
}