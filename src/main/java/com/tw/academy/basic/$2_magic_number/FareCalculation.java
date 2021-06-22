package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {

    public static final int EIGHT_DISCOUNT_START_EXPENSES = 100;
    public static final int EIGHT_DISCOUNT_END = 150;
    public static final int FIVE_DISCOUNT_START_EXPENSES = 150;
    public static final int FIVE_DISCOUNT_END = 400;
    public static final double EIGHT_DISCOUNT = 0.8;
    public static final double FIVE_DISCOUNT = 0.5;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (isExpensesInEightDiscount(cumulativeExpensesThisMonth)) {
            return originalPrice * EIGHT_DISCOUNT;
        }
        if (isExpensesInFiveDiscount(cumulativeExpensesThisMonth)) {
            return originalPrice * FIVE_DISCOUNT;
        }
        return originalPrice;
    }

    private boolean isExpensesInFiveDiscount(double cumulativeExpensesThisMonth) {
        return cumulativeExpensesThisMonth >= FIVE_DISCOUNT_START_EXPENSES && cumulativeExpensesThisMonth < FIVE_DISCOUNT_END;
    }

    private boolean isExpensesInEightDiscount(double cumulativeExpensesThisMonth) {
        return cumulativeExpensesThisMonth >= EIGHT_DISCOUNT_START_EXPENSES && cumulativeExpensesThisMonth < EIGHT_DISCOUNT_END;
    }
}
