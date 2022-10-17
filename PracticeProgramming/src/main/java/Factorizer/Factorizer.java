/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorizer;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author boram2
 */
public class Factorizer {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
         
        System.out.println("What number would you like to factor? ");
        int input = userInput.nextInt();
         
        int[] factors = factorize(input);
    
        System.out.println("The factors of " + input + " are:");
        System.out.println(Arrays.toString(factors));
        System.out.println(input + " has " + factors.length + " factors.");
//         System.out.println("");
           
        if (factors.length == 2) {
            System.out.println(input + " is prime.");
        } else {
            System.out.println(input + " is not prime.");
        }
    
    }
    
    static int[] factorize(int input) {
        ArrayList<Integer> factors = new ArrayList<>();
        
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                factors.add(i);
            }
        }
        
        return factors.stream().mapToInt(i -> i).toArray();
    }
   
        
    
}
