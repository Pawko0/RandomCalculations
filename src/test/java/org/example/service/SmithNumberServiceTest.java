package org.example.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmithNumberServiceTest {
    @Test
    public void testingSomeSmithNumbers(){
        SmithNumberService smithNumberService = new SmithNumberService();
        assertTrue(smithNumberService.isSmithNumber(4));
        assertTrue(smithNumberService.isSmithNumber(22));
        assertTrue(smithNumberService.isSmithNumber(27));
        assertTrue(smithNumberService.isSmithNumber(202));
        assertTrue(smithNumberService.isSmithNumber(535));
        assertTrue(smithNumberService.isSmithNumber(985));
        assertTrue(smithNumberService.isSmithNumber(1086));
    }
    @Test
    public void testingSomeNonSmithNumbers(){
        SmithNumberService smithNumberService = new SmithNumberService();
        assertFalse(smithNumberService.isSmithNumber(5));
        assertFalse(smithNumberService.isSmithNumber(23));
        assertFalse(smithNumberService.isSmithNumber(275));
        assertFalse(smithNumberService.isSmithNumber(851));
        assertFalse(smithNumberService.isSmithNumber(727));
        assertFalse(smithNumberService.isSmithNumber(1000));
        assertFalse(smithNumberService.isSmithNumber(1));
    }
}
