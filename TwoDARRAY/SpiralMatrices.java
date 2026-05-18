package TwoDARRAY;

public class SpiralMatrices {
    public static void Spriral_Method(int matrix [][]){
        int StartRow = 0;
        int StartCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(StartRow <=endRow && StartCol<=endCol){

            //top
            for(int j = StartCol;j<=endCol;j++){
                System.out.print(matrix[StartRow][j]+" ");
            }
            //right
            for(int i = StartRow + 1; i<=endRow;i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            //bottom
            for(int j = endCol - 1; j>=StartCol;j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i = endRow - 1; i>=StartRow+1;i--){
                System.out.print(matrix[i][StartCol]+" ");
            }
            StartCol++;
            StartRow++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
    };
    Spriral_Method(matrix);
    
}
}
