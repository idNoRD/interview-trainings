import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * Example:
 *
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
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listOfSets = new ArrayList<List<Integer>>();

        for (int num : nums) {
            int n = listOfSets.size();
            for (int i = 0; i < n; i++) {
                List<Integer> compoundSet = new ArrayList<Integer>(listOfSets.get(i));
                compoundSet.add(num);
                listOfSets.add(compoundSet);
            }
            List<Integer> oneNumberSet = new ArrayList<Integer>(1);
            oneNumberSet.add(num);
            listOfSets.add(oneNumberSet);
        }

        // add empty
        listOfSets.add(new ArrayList<Integer>());

        return listOfSets;
    }

}
