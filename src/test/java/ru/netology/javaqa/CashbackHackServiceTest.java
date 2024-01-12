package ru.netology.javaqa;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void calculateBonus(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals (actual,expected);
    }
    @Test
    public void calculateBonusIfAmount1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals (actual,expected);
    }
    @Test
    public void calculateBonusIfAmount999(){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals (actual,expected);
    }
    @Test
    public void calculateBonusIfAmount1(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals (actual,expected);
    }
    @Test
    public void calculateBonusIfAmount1001(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals (actual,expected);
    }
    @Test
    public void calculateBonusIfAmount0(){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals (actual,expected);
    }

}
