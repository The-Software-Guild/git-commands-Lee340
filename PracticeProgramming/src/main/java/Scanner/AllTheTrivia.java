/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanner;

import java.util.Scanner;

/**
 *
 * @author boram2
 */
public class AllTheTrivia {
    public static void main (String[] args) {
        
        String answer1;
        String answer2;
        String answer3;
        String answer4;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.print("What unit is equivalent to 1,024 Gigabytes? ");
        answer1 = inputReader.nextLine();
        
        System.out.print("Which planet is the only one that rotates clockwise in our Solar System? ");
        answer2 = inputReader.nextLine();
        
        System.out.print("The largest volcano ever discovered in our Solar System is located on which planet? ");        
        answer3 = inputReader.nextLine();
        
        System.out.print("What is the most abundant element in the earth's atmosphere? ");        
        answer4 = inputReader.nextLine();
        
        System.out.print("Wow, 1,024 Gigabytes is a " +  answer3 + "!\n" +
"I didn't know that the largest ever volcano was discovered on " + answer3 + "!\n" +
"That's amazing that " + answer2 + " is the most abundant element in the atmosphere...\n" +
answer4 + " is the only planet that rotates clockwise, neat!");        
    }
}
