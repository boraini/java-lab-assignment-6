package labassignment5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EquipmentTest {
    @Test
    void constructorTest() {
        assertNotNull(new ConcreteMixer("expertise in concrete mixing"), "constructor successfully creates an instance");
    }

    @Test
    void getRequirements() {
        ConcreteMixer sampleEquipment = new ConcreteMixer("expertise in concrete mixing");

        assertEquals("expertise in concrete mixing", sampleEquipment.getRequirements(), "getRequirements works");
    }

    @Test
    void testEqualsSameInstance() {
        ConcreteMixer cm1 = new ConcreteMixer("expertise in concrete mixing");

        assertEquals(cm1, cm1, "equals with the same instance");
    }

    @Test
    void testEqualsEquivalentInstances() {
        ConcreteMixer cm1 = new ConcreteMixer("expertise in concrete mixing");
        ConcreteMixer cm2 = new ConcreteMixer("expertise in concrete mixing");

        assertEquals(cm1, cm2, "equals with equivalent instances");
    }

    @Test
    void testEqualsDifferentInstances() {
        ConcreteMixer cm1 = new ConcreteMixer("expertise in concrete mixing");
        ConcreteMixer cm2 = new ConcreteMixer("expertise in Roman concrete mixing");
        JackHammer cm3 = new JackHammer("expertise in concrete mixing");

        assertNotEquals(cm1, cm2, "equals with same type but different fields");
    }

    @Test
    void testEqualsDifferentTypes() {
        ConcreteMixer cm1 = new ConcreteMixer("expertise in concrete mixing");
        JackHammer cm2 = new JackHammer("expertise in concrete mixing");

        assertNotEquals(cm1, cm2, "equals with same fields but different types");
    }

    @Test
    void testEqualsNull() {
        ConcreteMixer cm1 = new ConcreteMixer("expertise in concrete mixing");

        assertFalse(cm1.equals(null), "equals with null");
    }
}
