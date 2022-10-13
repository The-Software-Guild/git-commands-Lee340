
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boram2
 */
public class DogGenetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your dog's name? ");
        String name = scanner.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.\n\n");  
        System.out.println(name + " is:");
        
        double breed1 = Math.random();
        double breed2 = Math.random();
        double breed3 = Math.random();
        double breed4 = Math.random();
        double breed5 = Math.random();
        
        double total = breed1 + breed2 + breed3 + breed4 + breed5;
        
        breed1 = (int) Math.round(100 * breed1 / total);
        breed2 = (int) Math.round(100 * breed2 / total);
        breed3 = (int) Math.round(100 * breed3 / total);
        breed4 = (int) Math.round(100 * breed4 / total);
        breed5 = (int) Math.round(100 * breed5 / total);
        
        System.out.println(breed1 + "% St. Bernard");   
        System.out.println(breed2 + "% Chihuahua");  
        System.out.println(breed3 + "% Dramatic RedNosed Asian Pug");   
        System.out.println(breed4 + "% Common Cur");   
        System.out.println(breed5 + "% King Doberman");  
    
    }    
}
