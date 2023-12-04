package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {
   // 选择line 51 的 desision

    // 满足decision coverage和 condition coverage，同时控制只有一个输入不同，满足indepent affection
    @Test
    public void testTriang() {
        // 选择line 53 判断是否有边小于等 0 的 desision
        Tritype tri = new Tritype();

        assertEquals(3, tri.Triang(6, 6, 6));

        assertEquals(4, tri.Triang(-6, 6, 6));

        assertEquals(4, tri.Triang(6,-6, 6));

        assertEquals(4, tri.Triang(6, 6, -6));
    }
}