/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog6112_2026_testquestion2_st10523640;

import java.util.Scanner;

public class PROG6112_2026_TestQuestion2_ST10523640 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This is the RunApplication Class 
        
        // User selection for console device type
        System.out.println("SELECT CONSOLE TYPE:");
        System.out.println("1. PS5");
        System.out.println("2. Xbox");
        System.out.println("3. Nintendo Switch");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        String consoleType;
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "Xbox";
                break;
            case 3:
                consoleType = "Nintendo Switch";
                break;
            default:
                consoleType = "Unknown Console";
                break;
        }

        // Input Store Name
        System.out.print("ENTER THE STORE: ");
        String storeName = scanner.nextLine();

        // Input Total Sales Amount
        System.out.print("ENTER THE TOTAL SALES OF THE DEVICE :");
        int totalSales = scanner.nextInt();

        // Instantiate ConsoleSales object
        ConsoleSales salesReport = new ConsoleSales(consoleType, storeName, totalSales);

        // Display report using printReport method
        salesReport.printReport();

        scanner.close();
    }
}
