package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldTestAmountLessThan1000() {


        int actual = cashbackHackService.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
    public void shouldTestAmountMoreThan1000() {


        int actual = cashbackHackService.remain(1500);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldTestAmount1000() {


        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}