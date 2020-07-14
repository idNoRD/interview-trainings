import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseBitsTest {

    ReverseBits bitsManager = new ReverseBits();

    @Test
    void reverseBitsMinusThree() {
        assertEquals(-1073741825, bitsManager.reverseBits(-3));
    }

    @Test
    void reverseBitsOne() {
        assertEquals(Integer.MIN_VALUE, bitsManager.reverseBits(1));
    }

    @Test
    void reverseBits43261596() {
        assertEquals(964176192, bitsManager.reverseBits(43261596));
    }
}
