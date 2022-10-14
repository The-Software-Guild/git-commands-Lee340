/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Random;

import java.util.Random;

/**
 *
 * @author boram2
 */
public class Opinionator {
    public static void main (String[] args) {
        Random randomiser = new Random();
        System.out.println("I can't decide what animal I like the best.");
        System.out.println("I know! Random can decide FOR ME!");
        
        int x = randomiser.nextInt(5);
        
                System.out.println("The number we chose was: " + x);

        switch (x) {
            case 0 -> System.out.println("Llamas are the best!");
            case 1 -> System.out.println("Dodos are the best!");
            case 2 -> System.out.println("Woolly mammoths are DEFINITELY the best!");
            case 3 -> System.out.println("Sharks are the greatest, they have their own week!");
            case 4 -> System.out.println("Cockatoos are just so awesomme!");
            case 5 -> System.out.println("Have you ever met a naked mole-rat? They're GREAT!");
        }

        System.out.println("Thanks Random, maybe YOU'RE the best!");
        
    }
}
