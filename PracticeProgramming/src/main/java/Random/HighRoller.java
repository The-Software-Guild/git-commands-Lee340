/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author boram2
 */
public class HighRoller {
    public static void main (String[] args) {
        Random dice = new Random();
        Scanner numOfSides = new Scanner(System.in);
        
        int result = dice.nextInt(6) + 1;
        
        
        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + result);

        if (result == 1) {
            System.out.println("You rolled a critical failure!");
        }
        
        
        System.out.println("How many number of sides does your dice has? ");
        int sides = numOfSides.nextInt();
        
        int result2 = dice.nextInt(sides) + 1;
        
        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + result2);

        if (result2 == 1) {
            System.out.println("You rolled a critical failure!");
        } else if (result2 == sides) {
            System.out.println("You rolled a critical! Nice job!");
        }
    }
}
