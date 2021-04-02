package com;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class Tests {
    @Test
    public void task1Test1() {
        Assert.assertEquals(Arrays.asList(2, 2, 8), Tasks.task1(Arrays.asList("1", "2", 2, 2, "3", 8)));
    }

    @Test
    public void task1Test2() {
        Assert.assertEquals(Collections.emptyList(), Tasks.task1(Collections.emptyList()));
    }

    @Test
    public void task2Test1() {
        Assert.assertEquals("T", Tasks.task2("sTreSS"));
    }

    @Test
    public void task2Test2() {
        Assert.assertEquals("", Tasks.task2("stTrreEss"));
    }

    @Test
    public void task3Test1() {
        Assert.assertEquals(6, Tasks.task3(942));
    }

    @Test
    public void task3Test2() {
        Assert.assertEquals(2, Tasks.task3(493193));
    }

    @Test
    public void taskLoopTest1() {
        Assert.assertEquals(4, Tasks.task4Loop(Arrays.asList(1, 3, 6, 2, 2, 0, 4, 5), 5));
    }

    @Test
    public void task4LoopTest2() {
        Assert.assertEquals(2, Tasks.task4Loop(Arrays.asList(1, 3, 5, 6, 2, 0, 4, 7), 10));
    }

    @Test
    public void taskStreamTest1() {
        Assert.assertEquals(4, Tasks.task4Stream(Arrays.asList(1, 3, 6, 2, 2, 0, 4, 5), 5));
    }

    @Test
    public void task4StreamTest2() {
        Assert.assertEquals(2, Tasks.task4Stream(Arrays.asList(1, 3, 5, 6, 2, 0, 4, 7), 10));
    }

    @Test
    public void task5StreamTest1() {
        String inp = "Fired:Corwill;Wilfred:Corwill;Barney:TornBull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        String out = "[CORWILL, ALFRED][CORWILL, FIRED][CORWILL, RAPHAEL][CORWILL, WILFRED][TORNBULL, BARNEY][TORNBULL, BETTY][TORNBULL, BJON]";
        Assert.assertEquals(out, Tasks.task5(inp));
    }

    @Test
    public void task5StreamTest2() {
        String inp = "Oleg:Zadorozhnyi;Andrew:Zadorozhnyi;Maksym:Olegov";
        String out = "[OLEGOV, MAKSYM][ZADOROZHNYI, ANDREW][ZADOROZHNYI, OLEG]";
        Assert.assertEquals(out, Tasks.task5(inp));
    }

    @Test
    public void task1ExtraTest1() {
        Assert.assertEquals(531, Tasks.task1Extra(513));
    }

    @Test
    public void task1ExtraTest2() {
        Assert.assertEquals(-1, Tasks.task1Extra(111));
    }

    @Test
    public void task2ExtraTest1() {
        Assert.assertEquals("128.32.10.1", Tasks.task2Extra(2149583361L));
    }

    @Test
    public void task2ExtraTest2() {
        Assert.assertEquals("0.0.0.0", Tasks.task2Extra(0));
    }
}