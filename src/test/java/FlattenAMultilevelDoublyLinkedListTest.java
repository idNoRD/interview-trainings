import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlattenAMultilevelDoublyLinkedListTest {

    @Test
    void flatten() {

        FlattenAMultilevelDoublyLinkedList f = new FlattenAMultilevelDoublyLinkedList();
        FlattenAMultilevelDoublyLinkedList.Node n = new FlattenAMultilevelDoublyLinkedList.Node();
        FlattenAMultilevelDoublyLinkedList.Node n2 = new FlattenAMultilevelDoublyLinkedList.Node();
        FlattenAMultilevelDoublyLinkedList.Node child = new FlattenAMultilevelDoublyLinkedList.Node();

        child.val = 3;

        n.val = 1;
        n.child = child;

        n2.val = 2;
        n2.prev = n;
        n.next = n2;

        assertEquals("1 3 2", f.flatten(n).toString());


    }
}