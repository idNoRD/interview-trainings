/**
 * You are given a doubly linked list which in addition to the next and previous pointers,
 * it could have a child pointer, which may or may not point to a separate doubly linked list.
 * These child lists may have one or more children of their own, and so on, to produce a multilevel data structure,
 * as shown in the example below.
 *
 * Flatten the list so that all the nodes appear in a single-level, doubly linked list.
 * You are given the head of the first level of the list.
 *
 * Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * Output: [1,2,3,7,8,11,12,9,10,4,5,6]
 *
 *  1---2---3---4---5---6--NULL
 *          |
 *          7---8---9---10--NULL
 *              |
 *              11--12--NULL
 *
 * Input: head = [1,2,null,3]
 * Output: [1,3,2]
 * Explanation:
 *
 * The input multilevel linked list is as follows:
 *
 *   1---2---NULL
 *   |
 *   3---NULL
 *
 *
 */
public class FlattenAMultilevelDoublyLinkedList {
    public static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node i = this;
            while (i != null) {
                sb.append(i.val).append(" ");
                i = i.next;
            }
            return sb.toString().trim();
        }
    }

    private Node recursive(Node node) {
        if (node.child != null) {

            if (node.next != null) {
                Node temp = node.next;


                node.next = node.child;
                node.next.prev = node;
                node.child = null;

                Node last = recursive(node.next);
                temp.prev = last;
                last.next = temp;

                return recursive(temp);
            } else {

                node.next = node.child;
                node.next.prev = node;
                node.child = null;

                return recursive(node.next);
            }
        } else {
            if (node.next != null) {
                return recursive(node.next);
            } else {
                // no child no next
                return node;
            }
        }

    }

    public Node flatten(Node head) {
        if (head != null) {
            recursive(head);
        }
        return head;
    }

}
