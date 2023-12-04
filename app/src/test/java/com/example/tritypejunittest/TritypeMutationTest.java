package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutationTest {

    @Test
    // Test for the condition in Triang method
    public void testMutationInTriang1() {

        int result = Tritype.Triang(2, 2, 4);

        assertEquals(4, result);
    }
    @Test
    // Test for the condition in Triang method
    public void testMutationInTriang2() {

        int result = Tritype.Triang(3, 3, 5);

        assertEquals(2, result);
    }
}