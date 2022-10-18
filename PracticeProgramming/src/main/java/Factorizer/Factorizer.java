/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author boram2
 */
public class Factorizer {
    public void factorisation() {
            
    Scanner userInput = new Scanner(System.in);
    ArrayList<Integer> factors = new ArrayList<Integer>();
        
        System.out.print("What number would you like to factor? ");
        int input = userInput.nextInt();
         
    
        System.out.println("The factors of " + input + " are:");
        
        for (int i = 1; i <= input; i++) {
          if (input % i == 0) {
              System.out.print(i + " ");
              factors.add(i);
          }      
        }   
        
        System.out.println("\r");
        System.out.println(input + " has " + factors.size() + " factors.");
        
        int sum = 0;
            for(int j = 0; j < factors.size(); j++)
                sum = sum + j;
            if (input == sum) {
                System.out.println(input + " is a perfect number.");
            } else {
                System.out.println(input + " is not a perfact number.");
            }

        if (factors.size() == 2) {
            System.out.println(input + " is a prime mumber.");
        } else {
            System.out.println(input + " is not a prime number.");
        }
    
    }
    
}
