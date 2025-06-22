package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AppTest {

    static double calculateGrossPay(double hours, double rate) {
        if (hours <= 40) return hours * rate;
        return (40 * rate) + ((hours - 40) * rate * 1.5);
    }

    @Test
    void testRegularGrossPay() {
        double result = calculateGrossPay(35, 16.78);
        assertEquals(587.3, result, 0.01);
    }

    @Test
    void testOvertimeGrossPay() {
      double result = calculateGrossPay(45, 16.78);
      assertEquals(797.05, result, 0.01);  
}

    @Test
    void testInsuranceCostWithFewerDependents() {
        int dependents = 2;
        double insurance = (dependents >= 3) ? 35.00 : 15.00;
        assertEquals(15.00, insurance);
    }

    @Test
    void testInsuranceCostWithThreeDependents() {
        int dependents = 3;
        double insurance = (dependents >= 3) ? 35.00 : 15.00;
        assertEquals(35.00, insurance);
    }
}