import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalSortTest {

    @Test
    void diagonalSort() {
        int arr[][] = new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
        int arrExpected[][] = new int[][]{{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}};
        DiagonalSort diagonalSort = new DiagonalSort();
        assertArrayEquals(arrExpected, diagonalSort.diagonalSort(arr));
    }
}