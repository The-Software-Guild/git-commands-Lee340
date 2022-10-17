/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Whiles;

import java.util.Scanner;
/**
 *
 * @author boram2
 */
public class StayPositive {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("What number should I count down from? ");
        int answer = userInput.nextInt();
        System.out.println("Here goes!\n");
        
        while(answer >= 0) {
            for (int i = 0; i < 10 ; i++) {
                System.out.print (answer + " ");
                answer--;
            }
            System.out.println ();
          }
        System.out.println("Blast off!");
    }        
}
