package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeDecisionTest {
    @Test
    public void testTriang() {
        // 依旧选择line 51  的 desision

        // test case 1: (Side1 <= 0 || Side2 <= 0 || Side3 <= 0) = true

        // test case 2: (Side1 <= 0 || Side2 <= 0 || Side3 <= 0) = false

        Tritype tri = new Tritype();

        assertEquals(4, tri.Triang(0, 1, 2));

        assertEquals(3, tri.Triang(6, 6, 6));
    }
}