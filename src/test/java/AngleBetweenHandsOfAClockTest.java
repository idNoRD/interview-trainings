import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AngleBetweenHandsOfAClockTest {

    @Test
    void angleClock1() {
        AngleBetweenHandsOfAClock clock = new AngleBetweenHandsOfAClock();
        assertEquals(165, clock.angleClock(12,30));
    }

    @Test
    void angleClock2() {
        AngleBetweenHandsOfAClock clock = new AngleBetweenHandsOfAClock();
        assertEquals(75, clock.angleClock(3,30));
    }

    @Test
    void angleClock3() {
        AngleBetweenHandsOfAClock clock = new AngleBetweenHandsOfAClock();
        assertEquals(7.5, clock.angleClock(3,15));
    }

    @Test
    void angleClock4() {
        AngleBetweenHandsOfAClock clock = new AngleBetweenHandsOfAClock();
        assertEquals(155, clock.angleClock(4,50));
    }

    @Test
    void angleClock5() {
        AngleBetweenHandsOfAClock clock = new AngleBetweenHandsOfAClock();
        assertEquals(0, clock.angleClock(12,0));
    }
    @Test
    void angleClock6() {
        AngleBetweenHandsOfAClock clock = new AngleBetweenHandsOfAClock();
        assertEquals(76.5, clock.angleClock(1,57));
    }
}