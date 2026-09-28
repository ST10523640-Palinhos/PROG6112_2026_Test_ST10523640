/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_2026_testquestion2_st10523640;

/**
 *
 * @author matco
 */
public class ConsoleSales extends Console {

    // Constructor passing arguments to the parent class (Console)
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales); // Fixed: Removed data types here
    }

    // Method to print the detailed sales report
    public void printReport() {
        System.out.println("\n=============================================");
        System.out.println("            CONSOLE SALES REPORT             ");
        System.out.println("=============================================");
        System.out.println("CONSOLE TYPE : " + getConsoleType());
        System.out.println("STORE : " + getStore());
        System.out.println("TOTAL SALES  : " + getTotalSales());
        System.out.println("=============================================");
    }
}