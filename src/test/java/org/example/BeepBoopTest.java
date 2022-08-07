package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeepBoopTest {
    @Test
   public void runBeepBoop_countUpToOne_ArrayList() {
        BeepBoop testBeepBoop = new BeepBoop();
        List<Object> expectedOutPut = new ArrayList<>();
        expectedOutPut.add(1);
        assertEquals(expectedOutPut, testBeepBoop.runBeepBoop(1));
    }

    @Test
    public void runBeepBoop_countUpToGivenNumber_ArrayList() {
        BeepBoop testBeepBoop = new BeepBoop();
        ArrayList<Object> expectedOutPut = new ArrayList<>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        assertEquals(expectedOutPut, testBeepBoop.runBeepBoop(2));
    }

    @Test
    public void runBeepBoop_replaceMultiplesOfThree_ArrayList() {
        BeepBoop testBeepBoop = new BeepBoop();
        ArrayList<Object> expectedOutPut = new ArrayList<>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        expectedOutPut.add("ping");
        assertEquals(expectedOutPut, testBeepBoop.runBeepBoop(3));
    }

    @Test
    public void runBeepBoop_replaceMultipleOfFive_ArrayList() {
        BeepBoop testBeepBoop = new BeepBoop();
        ArrayList<Object> expectedOutPut = new ArrayList<>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        expectedOutPut.add("ping");
        expectedOutPut.add(4);
        expectedOutPut.add("pong");
        assertEquals(expectedOutPut, testBeepBoop.runBeepBoop(5));
    }

    @Test
    public void runBeepBoop_replaceMultipleOfBoth3And5_ArrayList() {
        BeepBoop testBeepBoop = new BeepBoop();
        ArrayList<Object> expectedOutPut = new ArrayList<>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        expectedOutPut.add("ping");
        expectedOutPut.add(4);
        expectedOutPut.add("pong");
        expectedOutPut.add("ping");
        expectedOutPut.add("7");
        expectedOutPut.add(8);
        expectedOutPut.add("ping");
        expectedOutPut.add("pong");
        expectedOutPut.add(11);
        expectedOutPut.add("ping");
        expectedOutPut.add(13);
        expectedOutPut.add(14);
        expectedOutPut.add("pingPong");
        assertEquals(expectedOutPut, testBeepBoop.runBeepBoop(15));
    }
}