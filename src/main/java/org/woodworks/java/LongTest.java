package org.woodworks.java;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongTest {

    @Test
    public void testRelationOperator() {
        Long l1 = new Long(1);
        Long l2 = new Long(2);
        assertEquals(true, l2 > 1L);
    }

//    @Test
    public void testExtractTimeFromDate(){
        LocalTime time = LocalTime.now();
//        assertEquals();
    }

}
