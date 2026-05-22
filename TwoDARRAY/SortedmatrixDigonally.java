import java.util.*;

class SortedmatrixDigonally {
    
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        // Start from first row
        for (int col = 0; col < n; col++) {
            sortDiagonal(mat, 0, col);
        }

        // Start from first column
        // row = 1 because (0,0) already done
        for (int row = 1; row < m; row++) {
            sortDiagonal(mat, row, 0);
        }

        return mat;
    }

    private void sortDiagonal(int[][] mat, int row, int col) {
        int m = mat.length;
        int n = mat[0].length;

        ArrayList<Integer> list = new ArrayList<>();

        int r = row;
        int c = col;

        // Collect diagonal elements
        while (r < m && c < n) {
            list.add(mat[r][c]);
            r++;
            c++;
        }

        // Sort the diagonal
        Collections.sort(list);

        // Put sorted values back
        r = row;
        c = col;
        int idx = 0;

        while (r < m && c < n) {
            mat[r][c] = list.get(idx++);
            r++;
            c++;
        }
    }
}