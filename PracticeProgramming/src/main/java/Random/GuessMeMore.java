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
public class GuessMeMore {
    public static void main (String[] args) {
        Random randomiser = new Random();
        Scanner answer = new Scanner(System.in);
        int mvAnswer = randomiser.nextInt(200)-99;
        
        System.out.print("I've chosen a number between -100 and 100. Bet you can't guess it!\n" + "Your guess: ");
        int answer1 = answer.nextInt();
        
        if (answer1 > mvAnswer) {
            System.out.println("Ha, nice try - too low! Try again!");
        } else if (answer1 < mvAnswer) {
            System.out.println("Ha, nice try - too high! Try again!");
        } else {
            System.out.println("Wow, nice guess! That was it!");
        }
        
        System.out.print("Your guess: ");
        int answer2 = answer.nextInt();
        
        if (answer2 == mvAnswer) {
            System.out.println("Wow, nice guess! That was it!");
        } else {
            System.out.println("Wrong again, bye!");
        }
    } 
}
