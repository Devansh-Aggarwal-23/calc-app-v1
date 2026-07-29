package com.devansh.example.calcapp.service;

import com.devansh.example.calcapp.CalcAppApplication;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

public class CalculationTest {

    Calculation calc;
    Logger logger = LoggerFactory.getLogger(CalculationTest.class);

    @BeforeEach
    public void setUp() {

        logger.info("setUp:- initialized and service instantiated");
        calc = new Calculation();
    }

    @Test
    public void testAdd() {
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(9,calc.add(4,5));
    }
    @Test
    public void testSub() {
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(5,calc.sub(9,4));
    }

    @Test
    public void testMul() {
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(36,calc.mul(9,4));
    }

    @Test
    public void testDiv() {
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(5,calc.div(20,4));
    }

    @Test
    public void testPow() {
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(25, calc.power(5, 2));
    }

    @AfterEach
    public void tearDown() {
        logger.info("tearDown:- initialized and service instantiated");
        calc = null;
    }

}
