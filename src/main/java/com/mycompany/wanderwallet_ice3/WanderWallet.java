/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.wanderwallet_ice3;

/**
 *
 * @author Vanshdeep, 2026
 */
/*
First refactor improvement:
created private final variables
instead of hardcoding exchange rates
inside every method.
*/

// private final double CAD_TO_USD_RATE = 0.73;
// private final double USD_TO_CAD_RATE = 1.37;
// private final double CAD_TO_INR_RATE = 61.00;

/*
Final refactor:
created enum to centralize all exchange rates
in one clean structure.
*/
enum CurrencyRate 
{
    CAD_TO_USD(0.73),
    USD_TO_CAD(1.37),
    CAD_TO_INR(61.00);

    private final double rate;

    CurrencyRate(double rate) 
    {
        this.rate = rate;
    }

    public double getRate() 
    {
        return rate;
    }
}

public class WanderWallet 
{


    public double convertCADToUSD(double cadAmount) 
    {

        // First simple hardcoded solution:
        // return 73;

        // First refactor:
        // return cadAmount * CAD_TO_USD_RATE;

        // Final refactored solution using enum:
        if (isAmountValid(cadAmount)) 
        {
            return cadAmount * CurrencyRate.CAD_TO_USD.getRate();
        } 
        else 
        {
            return 0;
        }
    }


    public double convertUSDToCAD(double usdAmount) 
    {

        // First simple hardcoded solution:
        // return 137;

        // First refactor:
        // return usdAmount * USD_TO_CAD_RATE;

        // Final refactored solution:
        if (isAmountValid(usdAmount)) 
        {
            return usdAmount * CurrencyRate.USD_TO_CAD.getRate();
        } 
        else 
        {
            return 0;
        }
    }


    public double convertCADToINR(double cadAmount) 
    {

        // First simple hardcoded solution:
        // return 610;

        // First refactor:
        // return cadAmount * CAD_TO_INR_RATE;

        // Final refactored solution:
        if (isAmountValid(cadAmount)) 
        {
            return cadAmount * CurrencyRate.CAD_TO_INR.getRate();
        } 
        else 
        {
            return 0;
        }
    }


    public boolean isAmountValid(double amount) 
    {

        // First simple solution:
        // return true;

        // First refactor:
        /*
        if(amount > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
        */

        // Final refactored solution:
        return amount > 0;
    }


    public double calculateTravelBudgetAfterFee(
            double amount,
            double feePercent) 
    {

        // First simple hardcoded solution:
        // return 950;

        // First refactor:
        /*
        double feeAmount =amount * feePercent / 100;

        return amount - feeAmount;
        */

        // Final refactored solution:
        if (isAmountValid(amount)&& feePercent >= 0) 
        {

            double feeAmount = amount * feePercent / 100;

            return amount - feeAmount;
        } 
        else 
        {
            return 0;
        }
    }
}
