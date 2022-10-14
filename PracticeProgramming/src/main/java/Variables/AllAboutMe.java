/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables;

/**
 *
 * @author boram2
 */
public class AllAboutMe {
    public static void main(String[] args) {
        String name = "Boram";
        String favoriteFood = "Sushi";
        int numOfPets = 1;
        String residence = "apartment";
        boolean canWhistle = true;
    
    System.out.println("My name is " + name + ".\n" + 
                        "My favorite food is " + favoriteFood + ".\n" +
                        "I have " + numOfPets + " pets.\n" +
                        "I live in a " + residence + ", and I love it here.");
    if (canWhistle == true) {
        System.out.println("It is true I know how to whistle.");
    } else {
        System.out.println("I don't know how to whistle.");
    }
    }
}
