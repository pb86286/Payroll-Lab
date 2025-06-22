package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Payroll Program!\n");

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("How many children do you have? ");
        int dependents = scanner.nextInt();

        double hourlyRate = 16.78;
        double overtimeRate = hourlyRate * 1.5;
        double grossPay;

        if (hoursWorked <= 40) {
            grossPay = hoursWorked * hourlyRate;
        } else {
            double overtimeHours = hoursWorked - 40;
            grossPay = (40 * hourlyRate) + (overtimeHours * overtimeRate);
        }

        double socialSecurityTax = grossPay * 0.06;
        double federalTax = grossPay * 0.14;
        double stateTax = grossPay * 0.05;
        double unionDues = 10.00;
        double insurance = (dependents >= 3) ? 35.00 : 15.00;

        double totalDeductions = socialSecurityTax + federalTax + stateTax + unionDues + insurance;
        double netPay = grossPay - totalDeductions;

        System.out.printf("\nPayroll Stub:\n\n");
        System.out.printf("   Hours:   %.1f\n", hoursWorked);
        System.out.printf("    Rate:   %.2f $/hr\n", hourlyRate);
        System.out.printf("   Gross:   $ %7.2f\n\n", grossPay);
        System.out.printf("  SocSec:   $ %7.2f\n", socialSecurityTax);
        System.out.printf("  FedTax:   $ %7.2f\n", federalTax);
        System.out.printf("   StTax:   $ %7.2f\n", stateTax);
        System.out.printf("   Union:   $ %7.2f\n", unionDues);
        System.out.printf("     Ins:   $ %7.2f\n\n", insurance);
        System.out.printf("     Net:   $ %7.2f\n", netPay);

        System.out.println("\nThank you for using the Payroll Program!");
    }
}