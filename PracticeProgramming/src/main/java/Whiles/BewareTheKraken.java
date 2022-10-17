/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author boram2
 */
public class BewareTheKraken {
    public static void main(String[] args) {
        Random randomiser = new Random();
        Scanner answer = new Scanner(System.in);
        
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;
        
        while(depthDivedInFt < 36200){
            
            System.out.print("So far, we've swum " + depthDivedInFt + " feet, and I can see a ");
            int fish = randomiser.nextInt(3);

            switch(fish) {
                case 0 -> System.out.println("tuna!");
                case 1 -> System.out.println("salmon!");
                case 2 -> System.out.println("sea bass!");
         
            }

            
            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }

            depthDivedInFt += 1000;
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
        
        System.out.print("Shall we stop here?(y/n) ");
        String yesOrno = answer.nextLine();
        if (yesOrno.equals("y")) {
            System.out.println("Let' go back to the surface now!");
        }
    }
}
