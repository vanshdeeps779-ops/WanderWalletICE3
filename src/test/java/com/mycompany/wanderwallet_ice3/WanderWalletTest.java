/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.wanderwallet_ice3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vanshdeep
 */
public class WanderWalletTest {

    public WanderWalletTest() {
    }

    @Test
    public void testConvertCADToUSD() {
        WanderWallet wallet = new WanderWallet();

        double result = wallet.convertCADToUSD(100);

        assertEquals(73, result);
    }

    @Test
    public void testConvertUSDToCAD() {
        WanderWallet wallet = new WanderWallet();

        double result = wallet.convertUSDToCAD(100);

        assertEquals(137, result);
    }

    @Test
    public void testConvertCADToINR() {
        WanderWallet wallet = new WanderWallet();

        double result = wallet.convertCADToINR(10);

        assertEquals(610, result);
    }

    @Test
    public void testInvalidAmount() {
        WanderWallet wallet = new WanderWallet();

        boolean result = wallet.isAmountValid(-5);

        assertFalse(result);
    }

    @Test
    public void testValidAmount() {
        WanderWallet wallet = new WanderWallet();

        boolean result = wallet.isAmountValid(500);

        assertTrue(result);
    }

    @Test
    public void testTravelBudgetAfterFee() {
        WanderWallet wallet = new WanderWallet();

        double result = wallet.calculateTravelBudgetAfterFee(1000,5);

        assertEquals(950, result);
    }

}
