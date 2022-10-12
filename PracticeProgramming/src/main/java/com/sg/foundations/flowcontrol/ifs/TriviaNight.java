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
public class TriviaNight {
    public static void main(String[] args) {
        
        int answer1;
        int answer2;
        int answer3;
        int score = 0;
        
        String stringAnswer1;
        String stringAnswer2;
        String stringAnswer3;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        
        System.out.println("FIRST QUESTION!\n" +
                            "What is the Lowest Level Programming Language?\n" +
                            "1) Source Code\n" +		
                            "2) Assembly Language\n" +
                            "3) C#\n" +				
                            "4) Machine Code");
    
        System.out.print("YOUR ANSWER: ");
        stringAnswer1 = myScanner.nextLine();
        answer1 = Integer.parseInt(stringAnswer1);
        if (answer1 == 4) {
            System.out.println("That's correct! Your score is ");
        } else {
            System.out.println("Sorry, the correct answer is 4.");
        }
        
        System.out.println("SECOND QUESTION!\n" +
                            "Website Security CAPTCHA Forms Are Descended From the Work of?\n" +
                            "1) Grace Hopper\n" +		
                            "2) Alan Turing\n" +
                            "3) Charles Babbage\n" +				
                            "4) Larry Page");
    
        System.out.print("YOUR ANSWER: ");
        stringAnswer2 = myScanner.nextLine();
        answer1 = Integer.parseInt(stringAnswer2);
        if (answer1 == 2) {
            System.out.println("That's correct!");
        } else {
            System.out.println("Sorry, the correct answer is 2.");
        }
        
        System.out.println("LAST QUESTION!\n" +
                            "Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?\n" +
                            "1) Serenity\n" +		
                            "2) The Battlestar Galactica\n" +
                            "3) The USS Enterprise\n" +				
                            "4) The Millennium Falcon");
    
        System.out.print("YOUR ANSWER: ");
        stringAnswer1 = myScanner.nextLine();
        answer1 = Integer.parseInt(stringAnswer1);
        if (answer1 == 3) {
            System.out.println("That's correct!");
        } else {
            System.out.println("Sorry, the correct answer is 3.");
        }
    }
}
