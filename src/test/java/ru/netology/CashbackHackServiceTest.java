package ru.netology;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void negativeTestRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainSecond() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(250);
        int expected = 750;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(500);
        int expected = 500;
        Assert.assertEquals(expected, actual);

    }
}
