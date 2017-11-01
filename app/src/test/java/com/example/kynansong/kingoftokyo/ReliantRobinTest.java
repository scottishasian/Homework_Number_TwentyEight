package com.example.kynansong.kingoftokyo;

/**
 * Created by kynansong on 01/11/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

import com.example.kynansong.kingoftokyo.*;

public class ReliantRobinTest {

    ReliantRobin reliantRobin;

    @Before
    public void before() {
        reliantRobin = new ReliantRobin("Rocket Car", 100);
    }

    @Test
    public void getType() {
        assertEquals("Rocket Car", reliantRobin.getType());
    }

    @Test
    public void getHealth() {
        assertEquals(100, reliantRobin.getHealth());
    }
}
