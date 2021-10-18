package labassignment5;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JobTest {
    @Test
    void constructorTest() {
        assertNotNull(new Job(new Address("A", 1, "2", "B"), "Engineer", new ArrayList<Equipment>(), new Date(1, 1, 2018)));
    }

    @Test
    void toStringTest() {
        List<Equipment> req = new ArrayList<>();
        req.add(new JackHammer("expertise in using the jackhammer"));
        req.add(new ScaffoldingTower("ability to climb scaffolding"));

        Address a = new Address("A", 1, "2", "B");

        Job j = new Job(a, "Engineer", req, new Date(1, 1, 2018));
        assertTrue(
                j.toString().matches("<Job \\d: Engineer. <Date: 1/1/2018, <Address: A 1, 2 B>. requiredEquipment: <ConcreteMixer requires expertise in using the jackhammer>, <ConcreteMixer requires ability to climb scaffolding>>"),
                "toString works correctly"
        );

    }

    @Test
    void testEqualsSameInstance() {
        List<Equipment> req = new ArrayList<>();
        req.add(new JackHammer("expertise in using the jackhammer"));
        req.add(new ScaffoldingTower("ability to climb scaffolding"));

        Address a = new Address("A", 1, "2", "B");

        Job j = new Job(a, "Engineer", req, new Date(1, 1, 2018));

        assertEquals(j, j, "equals with the same instance");
    }

    @Test
    void testEqualsEquivalentInstances() {
        List<Equipment> req1 = new ArrayList<>();
        req1.add(new JackHammer("expertise in using the jackhammer"));
        req1.add(new ScaffoldingTower("ability to climb scaffolding"));

        Address a1 = new Address("A", 1, "2", "B");

        Job j1 = new Job(a1, "Engineer", req1, new Date(1, 1, 2018));

        List<Equipment> req2 = new ArrayList<>();
        req2.add(new JackHammer("expertise in using the jackhammer"));
        req2.add(new ScaffoldingTower("ability to climb scaffolding"));

        Address a2 = new Address("A", 1, "2", "B");

        Job j2 = new Job(a2, "Engineer", req2, new Date(1, 1, 2018));

        assertEquals(j1, j2, "equals with equivalent instances");
    }

    @Test
    void testEqualsDifferentInstances() {
        List<Equipment> req1 = new ArrayList<>();
        req1.add(new JackHammer("expertise in using the jackhammer"));
        req1.add(new ScaffoldingTower("ability to climb scaffolding"));

        Address a1 = new Address("A", 1, "2", "B");

        Job j1 = new Job(a1, "Engineer", req1, new Date(1, 1, 2018));

        List<Equipment> req2 = new ArrayList<>();
        req2.add(new ConcreteMixer("expertise in mixing concrete"));
        req2.add(new ScaffoldingTower("ability to climb scaffolding"));

        Address a2 = new Address("A", 1, "3", "B");

        Job j2 = new Job(a2, "Engineer", req2, new Date(1, 1, 2018));

        assertNotEquals(j1, j2, "equals with same type but different fields");
    }

    @Test
    void testEqualsNull() {
        List<Equipment> req1 = new ArrayList<>();
        req1.add(new JackHammer("expertise in using the jackhammer"));
        req1.add(new ScaffoldingTower("ability to climb scaffolding"));

        Address a1 = new Address("A", 1, "2", "B");

        Job j1 = new Job(a1, "Engineer", req1, new Date(1, 1, 2018));

        assertFalse(j1.equals(null), "equals with null");
    }
}