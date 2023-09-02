package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    void showHowMuchMissing(){

        int amount = 900;

        assertEquals(100,service.remain(amount));
    }
    /*@Test
    void showBonus(){

        int amount = 1000;

        assertEquals(0,service.remain(amount));
    }*/

}