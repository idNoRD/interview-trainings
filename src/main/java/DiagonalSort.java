/**
 * Given a m * n matrix mat of integers, sort it diagonally in ascending order
 * from the top-left to the bottom-right then return the sorted array.
 *
 * Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
 * Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]
 */
public class DiagonalSort {

    public int[][] diagonalSort(int[][] mat) {
        for (int i=0; i < mat.length-1; i++) {
            for (int j=0; j < mat[i].length-1; j++) {
                int min = mat[i][j];
                int minY = i;
                int minX = j;
                int x = j + 1;
                int y = i + 1;
                boolean foundMin = false;

                while (x < mat[i].length && y < mat.length) {
                    if (mat[y][x] < min) {
                        min = mat[y][x];
                        minY = y;
                        minX = x;
                        foundMin = true;
                    }
                    x++;
                    y++;
                }

                if (foundMin) { // swap
                    int temp = mat[i][j];
                    mat[i][j] = mat[minY][minX];
                    mat[minY][minX] = temp;
                }
            }
        }

        return mat;
    }

}
