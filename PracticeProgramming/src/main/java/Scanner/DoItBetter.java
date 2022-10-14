/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanner;

import java.util.Scanner;

/**
 *
 * @author boram2
 */
public class DoItBetter {
        public static void main (String[] args) {
        
        int answer1;
        int answer2;
        int answer3;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.print("How many miles can you run? ");
        answer1 = Integer.parseInt(inputReader.nextLine());
        System.out.println("I can run " + (answer1 * 2 + 1) + " miles!");
        
        System.out.print("What is the number of hot dogs can you eat? " );
        answer2 = Integer.parseInt(inputReader.nextLine());
        System.out.println("I can eat " + (answer2 * 2 + 1) + " hot dogs!");
        
        System.out.print("How many languages do you know? ");        
        answer3 = Integer.parseInt(inputReader.nextLine());
        System.out.println("I know " + (answer1 * 2 + 1) + " languages!");
    }
}
