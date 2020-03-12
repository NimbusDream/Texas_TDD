package com.liuyuan.util;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author ly
 * @version 1.0
 * @date 2020/3/11 17:22
 */


public class TexasTest {

    @Test
    public void CompareTest(){

        assertEquals("White wins",Texas.Compare("2H3D5S9CKD","2C3H4S8CAH"));
        assertEquals("Black wins",Texas.Compare("2H4S4C2D4H","2S8SASQS3S"));
        assertEquals("Black wins",Texas.Compare("2H3D5S9CKD","2C3H4S8CKH"));
        assertEquals("Tie",Texas.Compare("2H3D5S9CKD","2D3H5C9SKH"));

    }

}
