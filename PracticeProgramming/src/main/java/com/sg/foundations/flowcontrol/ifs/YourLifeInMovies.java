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
public class YourLifeInMovies {
    public static void main(String[] args) {
                
        String usersName;
        String stringUsersYearOfBirth;
        int usersYearOfBirth;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Hey, let's play a game! What's your name? ");
        usersName = myScanner.nextLine();
                
        System.out.print("Ok, "+ usersName + ", when were you born? ");
        stringUsersYearOfBirth = myScanner.nextLine();
        usersYearOfBirth = Integer.parseInt(stringUsersYearOfBirth);
        
        System.out.println("Well "+ usersName + "...");  
        System.out.print("Did you know that ");   
        
        
        if (usersYearOfBirth < 2005) {
            System.out.println("Pixar's 'Up' came out over a decade ago?");   
        }
        if (usersYearOfBirth < 1995) {
            System.out.println("And that the first Harry Potter came out over 15 years ago!"); 
        }
        if (usersYearOfBirth < 1985) {
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT."); 
        }
        if (usersYearOfBirth < 1975) {
            System.out.println("Furthermore, the original Jurassic Park release is closer to the first lunar landing than it is to today."); 
        }
        if (usersYearOfBirth < 1965) {
            System.out.println("MASH TV series has been around for almost half a century!");
        }
    }
}
