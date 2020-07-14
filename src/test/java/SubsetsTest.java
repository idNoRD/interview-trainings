import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {

    /**
     * Input: nums = [1,2,3]
     * Output:
     * [
     *   [3],
     *   [1],
     *   [2],
     *   [1,2,3],
     *   [1,3],
     *   [2,3],
     *   [1,2],
     *   []
     * ]
     */
    @Test
    void subsets() {
        Subsets subsets = new Subsets();
        List<List<Integer>> listOfSets = new ArrayList<List<Integer>>();
        listOfSets.add(new ArrayList<Integer>() {{add(1);}});
        listOfSets.add(new ArrayList<Integer>() {{add(1); add(2);}});
        listOfSets.add(new ArrayList<Integer>() {{add(2);}});
        listOfSets.add(new ArrayList<Integer>() {{add(2); add(3);}});
        listOfSets.add(new ArrayList<Integer>() {{add(1); add(2); add(3);}});
        listOfSets.add(new ArrayList<Integer>() {{add(1); add(3);}});
        listOfSets.add(new ArrayList<Integer>() {{add(3);}});
        listOfSets.add(new ArrayList<Integer>());

        assertEquals(listOfSets,
                subsets.subsets(new int[]{1, 2, 3}));

    }
}