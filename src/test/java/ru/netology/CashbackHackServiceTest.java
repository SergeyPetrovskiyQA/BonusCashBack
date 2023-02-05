package ru.netology;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }
}