package com.example.kynansong.kingoftokyo;

/**
 * Created by kynansong on 01/11/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

import com.example.kynansong.kingoftokyo.*;

public class BlobMonsterTest {

    BlobMonster blobMonster;

    @Before
    public void before() {
        blobMonster = new BlobMonster("Jeff",100, 20, "Miao");
    }

    @Test
    public void hasName() {
        assertEquals("Jeff", blobMonster.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, blobMonster.getHealth());
    }

    @Test
    public void getAttackValue() {
        assertEquals(20, blobMonster.getAttackValue());
    }

    @Test
    public void getRoar() {
        assertEquals("Miao", blobMonster.getRoar());
    }
}