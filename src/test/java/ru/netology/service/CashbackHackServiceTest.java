package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainToFirstCashBack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void testRemainToSecondCashBack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1680;

        int expected = 320;
        int actual = service.remain(amount);

        assertEquals(actual,expected);


    }

    @Test
    public void testRemainIfNull() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual,expected);


    }

    @Test
    public void testRemainIfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual,expected);


    }

}