package Test.third.Interval;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.third.Interval.Interval;

import static org.junit.jupiter.api.Assertions.*;


public class IntervalTest {
    private Interval interval;

    @BeforeEach
    void setUp() {
        interval = new Interval();
    }

    @Test
    void InIntervalTest(){
        assertTrue(interval.numberInInterval(50));
    }

    @Test
    void OutLess25InIntervalTest(){
        assertFalse(interval.numberInInterval(10));
    }

    @Test
    void OutMore100InIntervalTest(){
        assertFalse(interval.numberInInterval(150));
    }

    @Test
    void Out25InIntervalTest(){
        assertFalse(interval.numberInInterval(25));
    }

    @Test
    void Out100InIntervalTest(){
        assertFalse(interval.numberInInterval(100));
    }
}