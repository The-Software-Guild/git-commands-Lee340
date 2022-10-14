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
public class PassingTheTuringTest {
    public static void main (String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        String yourName;
        String yourColor;
        String yourFruit;
        int yourNumber;
        
        System.out.print("Hello there!\n" + "What's your name? ");
        yourName = inputReader.nextLine();
        
        System.out.println("Hi, " + yourName + ", I'm Boram.");
        System.out.print("What is your favorite color? ");
        yourColor = inputReader.nextLine();
        
        System.out.println("Huh, " + yourColor + "? Mine's Electric Lime.");
        System.out.print("I really like limes. They're my favorite fruit, too.\n" +
                            "What's YOUR favorite fruit, " + yourName + "? ");
        yourFruit = inputReader.nextLine();
        
        System.out.println("Really? " + yourFruit + "? That's wild!");
        System.out.print("Speaking of favorites, what's your favorite number? ");
        yourNumber = Integer.parseInt(inputReader.nextLine());
        
        System.out.println(yourNumber + " is a cool number. Mine's -7.");
        System.out.println("Did you know " + yourNumber + " * -7 is " + yourNumber*-7 + "? That's a cool number too!");
        System.out.println("Well, thanks for talking to me, " + yourName + "!");
    }
}
