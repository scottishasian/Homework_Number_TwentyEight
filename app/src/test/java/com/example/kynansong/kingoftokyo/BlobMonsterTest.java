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
}
