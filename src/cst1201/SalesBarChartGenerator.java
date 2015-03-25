/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

import java.util.Scanner;

/**
 *
 * @author rkhatchadourian
 */
public class SalesBarChartGenerator {

    public static void main(String[] args) {
        //for user input.
        Scanner scanner = new Scanner(System.in);
        
        //ask the user for today's sales for the store 1.
        System.out.print("Enter the sales for store 1: ");
        int salesForStore1 = scanner.nextInt();

        //display the bar chart for store 1.
        int numberOfAsterisks = salesForStore1 / 100;
        System.out.println("I should print " + numberOfAsterisks + " *s");
        
        System.out.print("Sales for store 1: ");
        
        for (int i = 0; i < numberOfAsterisks; i++) {
            System.out.print("*");
        }
        System.out.println();
        
    }

}
