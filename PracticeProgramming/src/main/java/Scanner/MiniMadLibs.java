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
public class MiniMadLibs {
        public static void main (String[] args) {
        
        String noun1;
        String noun2;
        String adjective1;
        int number;
        String adjective2;
        String pluralNoun1;
        String pluralNoun2;
        String pluralNoun3;
        String verb1;
        String verb2;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Let's play MAD LIBS!\n\n");
        
        System.out.print("I need a noun: ");
        noun1 = inputReader.nextLine();
        
        System.out.print("Now an adjective: ");
        adjective1 = inputReader.nextLine();

        System.out.print("Another noun: ");
        noun2 = inputReader.nextLine();

        System.out.print("And a number: ");
        number = Integer.parseInt(inputReader.nextLine());

        System.out.print("Another adjective: ");
        adjective2 = inputReader.nextLine();

        System.out.print("A plural noun: ");
        pluralNoun1 = inputReader.nextLine();
        
        System.out.print("Another one: ");
        pluralNoun2 = inputReader.nextLine();
        
        System.out.print("One more: ");
        pluralNoun3 = inputReader.nextLine();
        
        System.out.print("A verb (infinitive form): ");
        verb1 = inputReader.nextLine();
        
        System.out.print("Same verb (past participle): ");
        verb2 = inputReader.nextLine();

        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.print(noun1 + ": the " + adjective1 + " frontier. These are the voyages of the starship " + noun2 +
                ". Its " + number + "-year mission: to explore strange " + adjective2 + pluralNoun1 + ", to seek out "
                + adjective2 + pluralNoun2 + " and " + adjective2 + pluralNoun3 + ", to boldly " + verb1 + " where no one has "
                + verb2 + " before.");
        }
    
}
