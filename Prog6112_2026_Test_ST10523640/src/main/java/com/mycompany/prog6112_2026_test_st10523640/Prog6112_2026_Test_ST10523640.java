/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112_2026_test_st10523640;

public class Prog6112_2026_Test_ST10523640 {

    public static void main(String[] args) {

        //Question 1
        
// Single-dimensional arrays
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "Xbox", "Nintendo Switch"};

        // Two-dimensional array for sales: [cityIndex][consoleIndex]
        int[][] salesData = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };

        System.out.println("=============================================================================");
        System.out.println("                     GAMING CONSOLE REPORT                       ");
        System.out.println("=============================================================================");
        System.out.printf("%-18s %-12s %-12s %-18s %-12s%n", "City", consoles[0], consoles[1], consoles[2], "Console Sales");
        System.out.println("-----------------------------------------------------------------------------");

        int highestSales = -1;
        String topCity = "";

        // Loop through cities
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            System.out.printf("%-18s ", cities[i]);

            for (int j = 0; j < consoles.length; j++) {
                int sales = salesData[i][j];
                System.out.printf("%-12d ", sales);
                cityTotal += sales;
            }

            // Display total console sales for each city on the right
            System.out.printf("%-12d%n", cityTotal);

            // Determine city with highest sales
            if (cityTotal > highestSales) {
                highestSales = cityTotal;
                topCity = cities[i];
            }
        }

        System.out.println("=============================================================================");
        System.out.println("City with the most sales: " + topCity.toUpperCase());
        System.out.println("=============================================================================");
    
    
    }
}