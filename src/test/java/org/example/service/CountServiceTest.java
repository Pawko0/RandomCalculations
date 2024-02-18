package org.example.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CountServiceTest {

    @Test
    public void testingPow() {
        //given
        CountService countService = new CountService();
        String expression1 = "2^4";
        String expression2 = "(-2)^4";
        String expression3 = "(-2)^5";
        String expression4 = "-2^4";

        //when
        double result1 = countService.count(expression1);
        double result2 = countService.count(expression2);
        double result3 = countService.count(expression3);
        double result4 = countService.count(expression4);

        //then
        Assertions.assertEquals(16.0, result1);
        Assertions.assertEquals(16.0, result2);
        Assertions.assertEquals(-32.0, result3);
        Assertions.assertEquals(-16.0, result4);

    }
    @Test
    public void testingNegativeNumber() {
        //given
        CountService countService = new CountService();
        String expression1 = "2 + (-2)";
        String expression2 = "2 - (-2)";
        String expression3 = " -2 - (-2)";
        String expression4 = " -2 - -2";

        //when
        double result1 = countService.count(expression1);
        double result2 = countService.count(expression2);
        double result3 = countService.count(expression3);
        double result4 = countService.count(expression4);

        //then
        Assertions.assertEquals(0, result1);
        Assertions.assertEquals(4, result2);
        Assertions.assertEquals(0, result3);
        Assertions.assertEquals(0, result4);
    }

    @Test
    public void testingWrongInputData(){
        //given
        CountService countService = new CountService();
        String expression1 = "2 + *2";
        String expression2 = "4 - x";

        //when
        double result1 = countService.count(expression1);
        double result2 = countService.count(expression2);

        //then
        Assertions.assertEquals(0.0, result1);
        Assertions.assertEquals(0.0, result2);
    }

}
