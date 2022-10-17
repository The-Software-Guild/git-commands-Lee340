/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Whiles;

import java.util.Random;

/**
 *
 * @author boram2
 */
public class MaybeItLovesMe {
    public static void main(String[] args) {
         Random randomiser = new Random();
         
         int num = randomiser.nextInt(89 - 13) + 13;
         System.out.println("Well here goes nothing...");
         int j = 0;
         while (j < num) {            
             if (j % 2 == 0) {
                System.out.println("It loves me NOT!");
                j++;
            } else {
                System.out.println("It LOVES me!");
                j++;
            }
         }  
            
         if (j % 2 != 0) {
                System.out.println("Awwww, bummer.!");
            } else {
                System.out.println("Oh, wow! It really LOVES me!");
            }
    }
}

