import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    /**
     * Input:
     *   1         1
     *  / \       / \
     * 2   3     2   3
     * <p>
     * [1,2,3],   [1,2,3]
     * <p>
     * Output: true
     */
    @Test
    void isSameTree123() {
        SameTree sameTree = new SameTree();
        SameTree.TreeNode tree1Node2 = sameTree.new TreeNode(2);
        SameTree.TreeNode tree1Node3 = sameTree.new TreeNode(3);
        SameTree.TreeNode tree1Node1 = sameTree.new TreeNode(1, tree1Node2, tree1Node3);

        SameTree.TreeNode tree2Node2 = sameTree.new TreeNode(2);
        SameTree.TreeNode tree2Node3 = sameTree.new TreeNode(3);
        SameTree.TreeNode tree2Node1 = sameTree.new TreeNode(1, tree2Node2, tree2Node3);

        assertTrue(sameTree.isSameTree(tree1Node1, tree2Node1));
    }

    /**
     * Input:
     *   1         1
     *  /           \
     * 2             2
     * <p>
     * [1,2],     [1,null,2]
     * <p>
     * Output: false
     */
    @Test
    void isSameTree12_vs1_2() {
        SameTree sameTree = new SameTree();
        SameTree.TreeNode tree1Node2 = sameTree.new TreeNode(2);
        SameTree.TreeNode tree1Node1 = sameTree.new TreeNode(1, tree1Node2, null);

        SameTree.TreeNode tree2Node2 = sameTree.new TreeNode(2);
        SameTree.TreeNode tree2Node1 = sameTree.new TreeNode(1, null, tree2Node2);

        assertFalse(sameTree.isSameTree(tree1Node1, tree2Node1));
    }

    /**
     * Input:
     *   1         1
     *  / \       / \
     * 2   1     1   2
     * <p>
     * [1,2,1],   [1,1,2]
     * <p>
     * Output: false
     */
    @Test
    void isSameTree121vs112() {
        SameTree sameTree = new SameTree();
        SameTree.TreeNode tree1Node2 = sameTree.new TreeNode(2);
        SameTree.TreeNode tree1Node3 = sameTree.new TreeNode(1);
        SameTree.TreeNode tree1Node1 = sameTree.new TreeNode(1, tree1Node2, tree1Node3);

        SameTree.TreeNode tree2Node2 = sameTree.new TreeNode(1);
        SameTree.TreeNode tree2Node3 = sameTree.new TreeNode(2);
        SameTree.TreeNode tree2Node1 = sameTree.new TreeNode(1, tree2Node2, tree2Node3);

        assertFalse(sameTree.isSameTree(tree1Node1, tree2Node1));
    }

    @Test
    void isSameTreeNullvsNull() {
        SameTree sameTree = new SameTree();
        assertTrue(sameTree.isSameTree(null, null));
    }

    /**
     * Input:
     *    0       0
     *   /       /
     * -5      -8
     * <p>
     * [0,-5],     [0,-8]
     * <p>
     * Output: false
     */
    @Test
    void isSameTree0negative5vs0negative8() {
        SameTree sameTree = new SameTree();
        SameTree.TreeNode tree1Node2 = sameTree.new TreeNode(-5);
        SameTree.TreeNode tree1Node1 = sameTree.new TreeNode(0, tree1Node2, null);

        SameTree.TreeNode tree2Node2 = sameTree.new TreeNode(-8);
        SameTree.TreeNode tree2Node1 = sameTree.new TreeNode(0, tree2Node2, null);

        assertFalse(sameTree.isSameTree(tree1Node1, tree2Node1));
    }
}