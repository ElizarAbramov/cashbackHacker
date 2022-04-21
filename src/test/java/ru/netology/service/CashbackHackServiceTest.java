package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemainderWithZeroAmount() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateRemainderNonZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 322;
        int expected = 678;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateRemainderWithBorderCondition() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainderWithBorderConditionSecond() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainderWithBorderConditionThird() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }
}