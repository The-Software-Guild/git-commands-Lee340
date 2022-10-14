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
public class CoinFlipper {
    public static void main (String[] args) {
        Random flip = new Random();
        
        int i = flip.nextInt(2);
        System.out.println("Ready, Set, Flip....!!");
        
        if (i == 0) {
            System.out.println("You got TAILS!");
        } else {
            System.out.println("You got HEADS");
        }
    }
}
