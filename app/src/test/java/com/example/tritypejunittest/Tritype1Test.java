package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tritype1Test {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();

        assertEquals(4, tri.Triang(1, 2, 5));   //不是三角形

        assertEquals(4, tri.Triang(0, 1, 2));    //不能构成三角形

        assertEquals(1, tri.Triang(3, 5, 7));   //非等腰三角形

        assertEquals(2, tri.Triang(2, 2, 3));   //等腰三角形

        assertEquals(2, tri.Triang(2, 3, 2));   //等腰三角形

        assertEquals(2, tri.Triang(3, 2, 2));   //等腰三角形

        assertEquals(3, tri.Triang(6, 6, 6));   //等边三角形
    }

}