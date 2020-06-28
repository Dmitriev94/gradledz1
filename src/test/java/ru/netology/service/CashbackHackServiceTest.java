package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @org.junit.Test
    public void shouldTestLessThen1000() {

        int actual = cashbackHackService.remain(999);
        int expected = 1;
        assertEquals(expected, actual);

    }
    @org.junit.Test
    public void shouldTestMoreThen1000() {

        int actual = cashbackHackService.remain(1700);
        int expected = 300;
        assertEquals(expected, actual);

    }
    @org.junit.Test
    public void shouldTestIf1000() {

        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);

    }
}