/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author boram2
 */
public class HealthyHearts {
        public static void main (String[] args) {
        
        int answer1;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.print("What is your age? ");
        answer1 = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Your maximum heart rate should be " + (220 - answer1) + " beats per minute.");
        System.out.print("Your target HR Zone is " + Math.round(((220 - answer1) * 0.5)) + " - " + Math.round(((220 - answer1) * 0.85)) + " beats per minute.");
    }
}
