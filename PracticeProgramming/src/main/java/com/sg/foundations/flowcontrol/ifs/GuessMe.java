/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author boram2
 */
public class GuessMe {
    public static void main(String[] args) {
        int myChoice = 8;
        int usersChoice;
                
        String stringUsersChoice;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.print("Your guess: ");
        stringUsersChoice = myScanner.nextLine();
        usersChoice = Integer.parseInt(stringUsersChoice);
        
        if (usersChoice > myChoice) {
            System.out.print(usersChoice + "? Too bad, way too high. I chose " + myChoice + ".");
        } else if (usersChoice < myChoice) {
            System.out.print(usersChoice + "? Ha, nice try - too low! I chose " + myChoice + ".");
        } else {
            System.out.print("Wow, nice guess! That was it!");
        }
    }
}
