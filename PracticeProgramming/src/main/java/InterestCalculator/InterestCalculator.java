/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterestCalculator;

import java.util.Scanner;

/**
 *
 * @author boram2
 */
public class InterestCalculator {
    public void interestCal() {
        float rate, year, compound_interest, balance;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("How much do you want to invest? ");
        balance = userInput.nextFloat();
        
        System.out.print("How many years are investing? ");
        year = userInput.nextFloat();
                
        System.out.print("What is the annual interest rate % growth? ");
        rate = userInput.nextFloat();
      

        System.out.println("Calculating...");
        for (int i = 1; i <= year; i++) {
            System.out.println("Year " + i + ":");
            
            compound_interest = (float) (balance * Math.pow(1 + (rate * 0.01 / 4), 4) - balance);
            balance = compound_interest + balance;

            System.out.print("Began with $");
            System.out.printf("%3.2f%n", balance - compound_interest);
            System.out.print("Earned $");
            System.out.printf("%3.2f%n", compound_interest);
            System.out.print("Ended with $");
            System.out.printf("%3.2f%n", balance);            
        }
    }
}