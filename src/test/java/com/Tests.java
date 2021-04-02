package com;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tests {
    @Test
    public void task1Test() {
        List<Integer> expected = Arrays.asList(1, 2, 3);

        Assert.assertEquals(expected, Tasks.task1(Arrays.asList("23", "fddf", 1, 2, "321ewa", 3)));
    }

    @Test
    public void task1WithEmptyListTest() {
        List<Integer> expected = Collections.emptyList();

        Assert.assertEquals(expected, Tasks.task1(Collections.emptyList()));
    }

    @Test
    public void task2Test() {
        String input = "ssEccrReT";
        String expected = "T";

        Assert.assertEquals(expected, Tasks.task2(input));
    }

    @Test
    public void task2WithEachCharRepeatedTest() {
        String input = "ssEccrReTT";
        String expected = "";

        Assert.assertEquals(expected, Tasks.task2(input));
    }

    @Test
    public void task3Test() {
        Assert.assertEquals(9, Tasks.task3(945));
    }

    @Test
    public void task3WithZeroTest() {
        Assert.assertEquals(0, Tasks.task3(0));
    }

    @Test
    public void task4Test() {
        List<Integer> input = Arrays.asList(1, 2, 4, 12, 3);

        Assert.assertEquals(2, Tasks.task4(input, 5));
    }

    @Test
    public void task4WithEmptyListTest() {
        List<Integer> input = Collections.emptyList();

        Assert.assertEquals(0, Tasks.task4(input, 5));
    }

    @Test
    public void task5Test() {
        String input = "Maksym:Pinchuk;Apple:Iphone;Name:Iphone";
        String expected = "(IPHONE, APPLE)(IPHONE, NAME)(PINCHUK, MAKSYM)";

        Assert.assertEquals(expected, Tasks.task5(input));
    }

    @Test
    public void task5WithEmptyInputTest() {
        String input = ";;;";

        Assert.assertEquals("", Tasks.task5(input));
    }

    @Test
    public void task6Test() {
        Assert.assertEquals(531, Tasks.task6(513));
    }

    @Test
    public void task6WithZeroInputTest() {
        Assert.assertEquals(-1, Tasks.task6(0));
    }

    @Test
    public void task7Test() {
        String expected = "0.0.2.1";
        Assert.assertEquals(expected, Tasks.task7(513));
    }
}