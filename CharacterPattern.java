public class CharacterPattern {
    public static void main(String[] args) {
        int n = 6;
        char ch = 'A';
        for(int line = 1; line<=n; line ++){
            for(int charr = 1 ; charr<=line ; charr++ ){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
