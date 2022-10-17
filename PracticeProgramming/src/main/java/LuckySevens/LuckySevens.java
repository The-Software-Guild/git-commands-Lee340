/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuckySevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author boram2
 */
public class LuckySevens {
    public static void main(String[] args) {
        Random roll = new Random();
        Scanner userInput = new Scanner(System.in);

        System.out.print("How many dollars do you have? ");
        int usersMoney = Integer.parseInt(userInput.nextLine());
        int max = usersMoney;
        int rollsAtMax = 0;
        int numberOfRolls = 0;

        while (true) {
            numberOfRolls += 1;
            int dice1 = Math.abs(roll.nextInt()) % 6 + 1;
            int dice2 = Math.abs(roll.nextInt()) % 6 + 1;

            if ((dice1 + dice2) == 7) {
                usersMoney += 4;
            } else {
                usersMoney -= 1;
            }

            if (usersMoney > max) {
                max = usersMoney;
                rollsAtMax = numberOfRolls;
            }
            
            if (usersMoney == 0) {
                break;
            }
        }
        
        System.out.println("You are broke after " + numberOfRolls + " rolls.");
        System.out.println("You should have quite after " + rollsAtMax + " rolls, when you had " + max);
    }
}

