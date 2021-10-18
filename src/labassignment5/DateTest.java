package labassignment5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    @Test
    void constructorTest() {
        assertNotNull(new Date(1, 1, 2018));
    }

    @Test
    void toStringTest() {
        assertEquals("<Date: 1/1/2018", (new Date(1, 1, 2018)).toString());
    }

    @Test
    void testEqualsSameInstance() {
        Date d1 = new Date(1, 1,  2018);

        assertEquals(d1, d1, "equals with the same instance");
    }

    @Test
    void testEqualsEquivalentInstances() {
        Date d1 = new Date(1, 1,  2018);
        Date d2 = new Date(1, 1,  2018);

        assertEquals(d1, d2, "equals with equivalent instances");
    }

    @Test
    void testEqualsDifferentInstances() {
        Date d1 = new Date(1, 1,  2018);
        Date d2 = new Date(1, 1,  2019);

        assertNotEquals(d1, d2, "equals with same type but different fields");
    }

    @Test
    void testEqualsNull() {
        Date d1 = new Date(1, 1,  2018);

        assertFalse(d1.equals(null), "equals with null");
    }
}